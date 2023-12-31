package phoneApp.objetos;

/**
 * VoiceMail representa uma mensagem na caixa postal. 
 * Com os atributos número = "number" e mensagem deixada = "voiceMsg".
 */
public class VoiceMail {
    private String number;
    private String voiceMsg;

    public VoiceMail() {
    }
    public VoiceMail(String number, String voiceMsg) {
        this.number = number;
        this.voiceMsg = voiceMsg;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public String getVoiceMsg() {
        return voiceMsg;
    }
    public void setVoiceMsg(String voiceMsg) {
        this.voiceMsg = voiceMsg;
    }



    
}
