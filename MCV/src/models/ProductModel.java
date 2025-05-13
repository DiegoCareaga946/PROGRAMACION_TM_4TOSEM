package models;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ProductModel {

    public ProductModel() {
    }

    public JSONArray get() {
        JSONParser jsonParser = new JSONParser();
        String url = AuthModel.class.getResource("/Files/producto.json").getPath();

        try (FileReader reader = new FileReader(url)) {
            JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);
            return (JSONArray) jsonObject.get("productos");
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void remove(long id) {
        JSONParser jsonParser = new JSONParser();
        String url = AuthModel.class.getResource("/Files/producto.json").getPath();

        try (FileReader reader = new FileReader(url)) {
            JSONObject root = (JSONObject) jsonParser.parse(reader);
            JSONArray productList = (JSONArray) root.get("productos");
            
            for (int i = 0; i < productList.size(); i++) {
                JSONObject product = (JSONObject) productList.get(i);
                if ((long) product.get("id") == id) {
                    productList.remove(i);
                    break;
                }
            }

            try (FileWriter file = new FileWriter(url)) {
                file.write(root.toJSONString());
                file.flush();
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
    
    public boolean addProduct(String nombre, double precio) {
        JSONParser jsonParser = new JSONParser();
        String url = AuthModel.class.getResource("/Files/producto.json").getPath();
        
        try (FileReader reader = new FileReader(url)) {
            JSONObject root = (JSONObject) jsonParser.parse(reader);
            JSONArray productList = (JSONArray) root.get("productos");
            
            JSONObject newProduct = new JSONObject();
            newProduct.put("id", getNextId(productList));
            newProduct.put("nombre", nombre);
            newProduct.put("precio", precio);
            newProduct.put("stock", 0);
            
            productList.add(newProduct);
            
            try (FileWriter file = new FileWriter(url)) {
                file.write(root.toJSONString());
                file.flush();
                return true;
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    private long getNextId(JSONArray productList) {
        long maxId = 0;
        for (Object obj : productList) {
            JSONObject product = (JSONObject) obj;
            long id = (long) product.get("id");
            if (id > maxId) {
                maxId = id;
            }
        }
        return maxId + 1;
    }
}