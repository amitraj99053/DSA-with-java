// building a module for managing patient records in a hospital
class Patient {
    private int patientId;
    private String name;
    private int age;
    private String[] diagnoses;
    private int diagnosisCount;
    private static int totalPatients = 0;

      public Patient(int id, String name, int age) {
        this.patientId = id;
        this.name = name;
        this.age = age;
        this.diagnoses = new String[5]; // Max 5 diagnoses
        this.diagnosisCount = 0;
        totalPatients++;
    }

      public void addDiagnosis(String diag) {
        if (diagnosisCount < 5) {
            diagnoses[diagnosisCount++] = diag;
        } else {
            System.out.println("Diagnosis list full for patient " + patientId);
        }
    }

     public void removeDiagnosis(String diag) {
        boolean found = false;
        for (int i = 0; i < diagnosisCount; i++) {
            if (diagnoses[i].equalsIgnoreCase(diag)) {
                // Shift left
                for (int j = i; j < diagnosisCount - 1; j++) {
                    diagnoses[j] = diagnoses[j + 1];
                }
                diagnoses[--diagnosisCount] = null;
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Diagnosis not found for removal.");
        }
    }

    // Display patient details
    public void displayDetails() {
        System.out.println("\nPatient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.print("Diagnoses: ");
        if (diagnosisCount == 0) {
            System.out.print("None");
        } else {
            for (int i = 0; i < diagnosisCount; i++) {
                System.out.print(diagnoses[i] + (i < diagnosisCount - 1 ? ", " : ""));
            }
        }
        System.out.println();
    }

    public int getAge() {
        return this.age;
    }

    // Static method to display total patients
    public static void showTotalPatients() {
        System.out.println("Total Registered Patients: " + totalPatients);
    }
}

public class HospitalManagementSystem {
    public static void main(String[] args) {
        // Create some patients
        Patient p1 = new Patient(101, "Gunjan", 30);
        Patient p2 = new Patient(102, "Amit", 21);
        Patient p3 = new Patient(103, "Anchal", 19);

        
        p1.addDiagnosis("Fever");
        p1.addDiagnosis("Cold");
        p2.addDiagnosis("Diabetes");

       
        p1.removeDiagnosis("Cold");

        
        p1.displayDetails();
        p2.displayDetails();
        p3.displayDetails();

        
        Patient.showTotalPatients();

        
        System.out.println("\nPatients between age 25 and 35:");
        Patient[] allPatients = {p1, p2, p3};
        for (Patient p : allPatients) {
            if (p.getAge() >= 25 && p.getAge() <= 35) {
                p.displayDetails();
            }
        }
    }
}
