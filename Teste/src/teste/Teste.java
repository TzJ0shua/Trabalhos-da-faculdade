
package teste;


public class Teste {

  public static void main(String[] args) throws Exception {

    try {

      System.out.println("CS II is ");

      int i = 0;

      int y = 2 / i;

      System.out.println("Java. ");

    }

    catch(Exception e){

        System.out.println("over. ");

        throw new Exception(e);

    }

    finally {

      System.out.println("Finally. ");

    }

    System.out.println("We made it!");

  }

}