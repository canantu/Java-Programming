package week12_11_26_2022.Statics;
import static week12_11_26_2022.Statics.BrowserUtils.*;

public class SearchInGoogle {

    public static void main(String[] args) {
        navigateUrl("Google");
        search("Adam");
        System.out.println(staticVariable);
    }
}
