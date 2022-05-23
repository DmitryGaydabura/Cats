public class Main {
    public static void main(String[] args) {
        Utility.printCat();

        Cats Barsik = new Cats("Barsik", 2,3,"Siam");
        Cats Alice = new Cats("Alice", 4,4,"Sphynx");
        Cats Abstract = new Cats();

        if(Cats.equals(Barsik,Alice)){
            System.out.println("This cats are same!");
        }else{
            System.out.println("This cats are not same.");
        }

    }
}
