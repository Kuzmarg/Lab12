package decorator;

public class Main {
    public static void main(String[] args) {
        Document document = new SmartDocument("gs://lab_12/2022-06-27 (9).png");
//        document = TimedDocument(document);
//        document = CashedDocument(document);
        System.out.println(document.parse());


    }
}
