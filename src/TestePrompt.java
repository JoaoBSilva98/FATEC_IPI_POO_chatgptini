public class TestePrompt {
    public static void main(String[] args) throws Exception{
        var chatgptclient = new chatgptclient();
        chatgptclient.criarPergunta("",
        "Java", 
        "Alternativa",
        "Ultra Hardcore",
        "Porque o ceu é azul?");
    }
}
