public class DischargeRecord {

    private int patientId;
    private long dischargeTime;  // Taburcu edilme zamanı (timestamp)

    public DischargeRecord(int patientId) {
        this.patientId = patientId;
        this.dischargeTime = System.currentTimeMillis();  // Kayıt oluşturulduğu andaki sistem zamanını alır
    }
    // Getter metodları: Dışarıdan bu verilere sadece okuma amaçlı erişmek için
    public int getPatientId() {
        return patientId;
    }

    public long getDischargeTime() {
        return dischargeTime;
    }
    public String toString() {
        return "DischargeRecord{" +
                "patientId=" + patientId +
                ", dischargeTime=" + dischargeTime +
                '}';
    }
}
