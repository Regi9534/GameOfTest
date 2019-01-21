package src;

import java.util.HashMap;
import java.util.List;

public class QuestDealer {
    private HashMap<String, String> questList = new HashMap<>();
    private String currentQuest = null;
    private Game game;

    public QuestDealer(Game game) {
        this.game = game;
    }

    public void generateQuests() {
        getQuestList().put("You are retarded", "Yes");
    }

    public String getAnswerFromQuestString(String quest) {
        if (questList.containsKey(quest)) {
            String currentAnswer = questList.get(quest);
            return currentAnswer;
        } else return "No current quest";
    }

    /**
     * @return The new generated Question
     */
    public String findNewQuest() {
        int i = (int) (Math.random() * getQuestList().size() + 1);

        return getQuestByIndex(i);
    }

    /**
     * Return nothing and setinstand a newQuestion
     */
    public void findAndSetNewQuest() {
        int i = (int) (Math.random() * getQuestList().size() + 1);

        setCurrentQuest(getQuestByIndex(i));
    }

    public String getQuestByIndex(int i) {
        List<String> Questions = (List<String>) questList.keySet();
        String QuestionByIndex = Questions.get(i);
        return QuestionByIndex;
    }

    public void setCurrentQuest(String newQuest) {
        this.currentQuest = newQuest;
    }

    public String getCurrentQuest() {
        return this.currentQuest;
    }

    public void removeCurrentQuestFromQuestList() {
        questList.remove(getCurrentQuest());
    }

    public HashMap<String, String> getQuestList() {
        return this.questList;
    }

    public String resolveQuest(String answer) {
        if (getAnswerFromQuestString(getCurrentQuest()).equalsIgnoreCase(answer)) {
            return "The answer is correct";
        } else return "The answer is wrong";
    }

    public String questRequest() {
        if (getCurrentQuest() == null) {
            findAndSetNewQuest();
            return "You have no quest but u got one: " + getCurrentQuest();
        } else {
            return getCurrentQuest();
        }
    }

}



