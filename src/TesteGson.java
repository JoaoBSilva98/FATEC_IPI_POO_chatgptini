import com.google.gson.Gson;

public class TesteGson {
    public static void main(String[] args) {
        var chatgptrequest = new chatgptrequest("text-davinci-003","Porque o céu é azul?", 150);
        var gson = new Gson();
        String json = gson.toJson(chatgptrequest);
        System.out.println(json);


        var copia = gson.fromJson(json, chatgptrequest.class);
        System.out.println(copia.getModel());
    }
    
}
