package ZipcodeZB;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Database {



    /*
     * Store data about all of the zipcodes.
     */


        private ArrayList<Zipcode> codes;

        public Database() {
            // allocate the array list
            this.codes = new ArrayList<>();
            this.load_zips();
        }

        // fill the zipcode array list with real data
        private void load_zips() {
            // connect to the web page of speeds
            URL url = null;    // null is the "nothing value"
            Scanner s = null;

            try {
                url = new URL("http://10.60.15.25/~ehar/cs219/zips.txt"); // create a URL object for the path
                s = new Scanner(url.openConnection().getInputStream());
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            // read zipcode file line by line
            while (s.hasNextLine()) {
                String line = s.nextLine();
                String [] parts = line.split(",");
                Zipcode z = new Zipcode(
                        parts[1].substring(1,parts[1].length() - 1),
                        parts[2].substring(1,parts[2].length() - 1),
                        parts[3].substring(1,parts[3].length() - 1),
                        Double.parseDouble(parts[4]),
                        Double.parseDouble(parts[5]),
                        Integer.parseInt(parts[6])
                );
                codes.add(z);
            }

        }

        Collections.sort(this.codes):
    //Array list part of javas connection classes
    // LIST SIMILAR TO A CLASS BUT IT DEFINES FUNCTIONS BUT DOES NOT IMPLEMENT THEM
    //Function must be implemented by a class that implements the interface
    // Write a function to search for zipcode data by a zipcode
    //wherever we expect a List, we can substitiute an array list
    public Zipcode findByZip1( String code){

        for (Zipcode zipcode : this.codes) {
            if (code.equals(zipcode.getCode()))
                return zipcode;

        }
            return null;


        public Zipcode search;(String codes){
            return bsearch(code, 0, codes.size()-1);// provides simple interface to bsearch  function
        }
    }

    private Zipcode bsearch(String code, int i, int i1) {
    }

    public ArrayList<Zipcode> getCodes() {
        return codes;
    }

 public Zipcode search(String code) {
     int pos = Collections.binarySearch(this.codes,
             new Zipcode(code,"","",0,0,0));
     if (pos != -1)
         return this.codes.get(pos);
     else return null;

        }

    public Zipcode getNorthern( String code){

        for (Zipcode zipcode : this.codes) {
        }
        Zipcode zipcode;

        if (code > zipcode.getCode())
            return zipcode;

        return null;
    }

        public Zipcode getNorthern(String codes){
            return LatLngInterface(code, 0, codes.size()+1);
        }


}




