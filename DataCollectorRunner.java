public class DataCollectorRunner {
    public static void main(String[] args) {
        DataCollector dc = new DataCollector();
        dc.setData("socialMediaPosts.txt", "targetWords.txt");
        dc.printAllPosts();
        dc.printAllTargetWords();
    }
}
