package compressiontool;

public class Client {

    public static void main(String[] args) {
        // filename as input
        // throw an error if filename is not valid
        // read, process and determine frequencies of each character
        // compress - encode
        // output file
        // decode
        // un compress
        String filePath = "";
        FrequencyTable table = new FrequencyTable(filePath);
        long count = table.getCount('x');
        System.out.println(count);
    }

}
