import java.text.BreakIterator;
import java.util.function.IntFunction;

import javax.sql.rowset.spi.SyncResolver;

public class fak {
public static void main (String []args) {

System.out.println(faku(5));

}

public static int faku (int upper){
if (upper <= 0){
return 1;
}

else {

return upper * faku(upper - 1);
}


}

    
}




