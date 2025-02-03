package day17.Task1;

public enum AnswerType {
    HI("Hi", "Hello"),
    BYE("Bye", "Good bye"),
    HOWAREYOU("How are you", "How are your doing"),
    UNKNOWN(null, "Unknown message");

    private final String message;
    private final String answer;

    AnswerType(String message, String answer){
        this.message = message;
        this.answer = answer;
    }
    public String getMessage(){
        return message;
    }

    public String getAnswer(){
        return answer;
    }

    public static AnswerType findAnswerType(String message){
        if(message == null){
            return UNKNOWN;
        }

        for(AnswerType answerType: AnswerType.values()){
            if(message.equals(answerType.message)){
                return answerType;
            }
        }
        return UNKNOWN;
    }
}
