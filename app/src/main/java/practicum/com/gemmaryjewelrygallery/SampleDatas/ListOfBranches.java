package practicum.com.gemmaryjewelrygallery.SampleDatas;

import android.widget.Toast;

import java.util.ArrayList;

import practicum.com.gemmaryjewelrygallery.Holder.BranchHolder;
import practicum.com.gemmaryjewelrygallery.Object.Branch;
import practicum.com.gemmaryjewelrygallery.R;

public class ListOfBranches {

    public static ArrayList<Branch> getBranches(){
        final ArrayList<Branch> branches = new ArrayList<>();


        //Jagna Branch
        Branch b = new Branch();
        b.setBranchName("Jagna Branch");
        b.setBranchProvince("Bohol");
        b.setBranchAddress("Looc, Jagna, Bohol");
        branches.add(b);

        //Tagbilaran City, Bohol Branch 2
        b = new Branch();
        b.setBranchName("Tagbilaran City, Bohol Branch 2");
        b.setBranchProvince("Bohol");
        b.setBranchAddress("C. P. G. Avenue, Cogon, Tagbilaran City, Bohol");
        branches.add(b);

        //Lahug Branch
        b = new Branch();
        b.setBranchName("Lahug Branch");
        b.setBranchProvince("Cebu");
        b.setBranchAddress("Gorordo Ave., Lahug, Cebu City, Cebu");
        branches.add(b);

        //Daanbantayan Branch
        b = new Branch();
        b.setBranchName("Daanbantayan Branch");
        b.setBranchProvince("Cebu");
        b.setBranchAddress("Ar3 Bldg., Osmeña St., Poblacion, Daanbantayan, Cebu");
        branches.add(b);


        //Lutopan Branch
        b = new Branch();
        b.setBranchName("Lutopan Branch");
        b.setBranchProvince("Cebu");
        b.setBranchAddress("Don Andres Soriano, Lutopan, Toledo City, Cebu");
        branches.add(b);

        //Basak Branch
        b = new Branch();
        b.setBranchName("Basak Branch");
        b.setBranchProvince("Cebu");
        b.setBranchAddress("Basak, Mandaue City, Cebu");
        branches.add(b);

        //Borromeo Branch
        b = new Branch();
        b.setBranchName("Borromeo Branch");
        b.setBranchProvince("Cebu");
        b.setBranchAddress("Borromeo St., Brgy. Pahina Central, Cebu City, Cebu");
        branches.add(b);

        //Minglanilla Branch
        b = new Branch();
        b.setBranchName("Borromeo Branch");
        b.setBranchProvince("Cebu");
        b.setBranchAddress("Poblacion Ward Iv, Minglanilla, Cebu");
        branches.add(b);

        //La Carlota Branch
        b = new Branch();
        b.setBranchName("La Carlota Branch");
        b.setBranchProvince("Negros Occidental");
        b.setBranchAddress("Valois Cor. Yunque Sts., Brgy. 3, La Carlota City, Negros Occidental");
        branches.add(b);

        //Corrales Branch
        b = new Branch();
        b.setBranchName("Corrales Branch");
        b.setBranchProvince("Misamis Oriental");
        b.setBranchAddress("Marcoso Bldg., Corrales-Hayes Sts., Brgy. 40, Cagayan De Oro City, Misamis Oriental");
        branches.add(b);

        return branches;
    }
}
