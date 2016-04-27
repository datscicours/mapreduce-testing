package testes;

import java.io.*;

/**
 * Created by vagrant on 4/26/16.
 */
public class ResourceLoadTest {

  public void loadTest() throws IOException {

    System.out.println("LoadTest loader = " + this.getClass().getClassLoader());
    InputStream is = this.getClass().getResourceAsStream("test.properties");
    BufferedReader br = new BufferedReader(new InputStreamReader(is));
    System.out.println(br.readLine());

  }

  public static void staticLoadTest() throws IOException{

    System.out.println("StaticLoadTest loader path= " + ResourceLoadTest.class.getClassLoader());
    InputStream is = ResourceLoadTest.class.getResourceAsStream("testes/test.properties");
    BufferedReader br = new BufferedReader(new InputStreamReader(is));
    System.out.println(br.readLine());

  }


  public static void main(String[] args) throws IOException {
    ResourceLoadTest test = new ResourceLoadTest();
    test.loadTest();

    staticLoadTest();
  }


}
