import java.util.*;

public class Main {

    public static void main(String[] args) {
        int clients_count = 100;
        int index = 0;
        char[] vogals=new char[]{'a', 'e','i','o','u'};
        char[] consoants= new char[]{'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'};
        List<Client> clientes = new ArrayList<Client>();
        while (index <= clients_count) {
            Random random = new Random();
            StringBuilder name = new StringBuilder();

            for (int i = 0; i < 3; i++) {
                int indexRandom = random.nextInt(vogals.length);
                char vogalRandom= vogals[indexRandom];

                name.append(vogalRandom);
            }
            for (int i = 0; i < 3; i++) {
                int indexRandom = random.nextInt(consoants.length);
                char consoantRandom= consoants[indexRandom];

                name.append(consoantRandom);
            }
            Client cliente = new Client(shuffleString(name.toString()), random.nextInt(100));

            clientes.add(cliente);
            index++;
        }
        clientes.forEach(value->{
            System.out.println("\n------------------------------\n");
            System.out.printf("nome: %s \n",value.getName());
            System.out.printf("idade: %d",value.getAge());


        });


    }
    public static String shuffleString(String input) {
        List<Character> characters = new ArrayList<>();
        for (char c : input.toCharArray()) {
            characters.add(c);
        }
        Collections.shuffle(characters);
        StringBuilder shuffled = new StringBuilder();
        for (char c : characters) {
            shuffled.append(c);
        }
        return shuffled.toString();
    }
}