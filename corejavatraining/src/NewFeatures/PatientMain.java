package NewFeatures;

import java.util.ArrayList;

public class PatientMain {
	
	public static void main(String[] args) {
		ArrayList<Patient> patient=new ArrayList<Patient>();
		
		patient.add(new Patient(41,"koushik",29));
		patient.add(new Patient(42,"subahs",22));
		patient.add(new Patient(43,"arvind",23));
		
		Collections.sort(patient,new Comparator());
		for(Patient i:patient)
		{
			System.out.println(i);
		}
		
		
		Collections.sort(patient,new PatientAgeSort());	
		for(Patient i:patient)
		{
			System.out.println(i);
		}
		System.out.println("elemets added to tree set");
		TreeSet<Patient> ts = new TreeSet<Patient>();
		
		 Iterator<Patient> strIterator = patient.iterator();
	        while(strIterator.hasNext()) {
	            System.out.println(strIterator.next());
	        }
		
		
		
		
	}

}
