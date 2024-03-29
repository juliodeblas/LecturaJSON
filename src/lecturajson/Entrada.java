/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecturajson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Usuario DAM 2
 */
public class Entrada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MalformedURLException, IOException, JSONException {
        // TODO code application logic here
        String link = "https://api.themoviedb.org/3/movie/now_playing?api_key=4ef66e12cddbb8fe9d4fd03ac9632f6e&language=en-US&page=1";
        URL url = new URL(link);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        BufferedReader lector = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
        StringBuilder builder = new StringBuilder();
        String linea;

        while ((linea = lector.readLine()) != null) {
            builder.append(linea);
        }

        JSONObject jSONObject = new JSONObject(builder.toString());
        JSONArray jSONArray = jSONObject.getJSONArray("results");
        
        for(int i =0; i<jSONArray.length(); i++){
            JSONObject object = (JSONObject)jSONArray.get(i);
            String titulo = object.getString("original_title");
            String descripcion = object.getString("overview");
            System.out.println(String.format("Titulo: %s %n Descripción: %s", titulo, descripcion));
        }
    }

}
