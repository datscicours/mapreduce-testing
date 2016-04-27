import java.io.IOException;

/**
 * Created by vagrant on 4/26/16.
 */
public class TestResourceLoadTest {

  public static void main(String[] args) throws IOException {

    try {
      new testes.ResourceLoadTest().loadTest();
    } catch (Exception e){
      System.out.println(e);
    }
    try {
      testes.ResourceLoadTest.staticLoadTest();
    } catch (Exception e) {
      System.out.println(e);
    }

  }

}
