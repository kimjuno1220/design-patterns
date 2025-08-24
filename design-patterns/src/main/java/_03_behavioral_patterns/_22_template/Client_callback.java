package _03_behavioral_patterns._22_template;

public class Client_callback {
    public static void main(String[] args) {
        FileProcessor_callback fileProcessor = new FileProcessor_callback("number.txt");
        // 2. 두번째 방법
//        int result = fileProcessor.process((result1, number) -> result1 += number);
        int result = fileProcessor.process(new Operator() {
            @Override
            public int getResult(int result, int number) {
                return result += number;
            }
        });
        System.out.println(result);
    }
}