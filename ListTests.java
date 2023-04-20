import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

public class ListTests {
    @Test
    public void testerFilter(){
        List<String> arrlst = new ArrayList<>();
        arrlst.add("a");
        arrlst.add("b");
        arrlst.add("b");

        List<String> filter1 = ListExamples.filter(arrlst, );

    }
}
