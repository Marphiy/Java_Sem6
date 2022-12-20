import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class main {
        public static void main(String[] args) {
            List<String> criterias = new ArrayList<>(Arrays.asList("name", "CPU", "ROM", "HDD", "Video", "color"));
            List<String> names = new ArrayList<>(Arrays.asList("IBM", "Lenovo", "HP", "Dell", "Aser", "Asus", "Fujitsu", "NEC"));
            List<String> cpus = new ArrayList<>(Arrays.asList("AMD Ryzen 3", "AMD Ryzen 5", "AMD Ryzen 7", "AMD Ryzen 9", 
                            "Intel Pentium Silver", "Intel Pentium Gold", "Intel Celleron", "Intel I3", "Intel I5", "Intel I7", "Intel I9"));
            List<Integer> romCapacity = new ArrayList<>(Arrays.asList(8, 16, 32, 64));
            List<Integer> hddCapacity = new ArrayList<>(Arrays.asList(256, 512, 1024));
            List<String> videoAdaptors = new ArrayList<>(Arrays.asList("GeForce", "Radeon", "Arc", "Iris"));
            List<String> colors = new ArrayList<>(Arrays.asList("white", "black", "blue", "grey", "perl"));
         
            Random random = new Random();
            List<Notebook> notebooks = new ArrayList<>();
            
            for(int i = 0; i < 10; i++){
                Notebook nb = new Notebook(names.get(random.nextInt(names.size())), cpus.get(random.nextInt(cpus.size())), 
                romCapacity.get(random.nextInt(romCapacity.size())), hddCapacity.get(random.nextInt(hddCapacity.size())), 
                videoAdaptors.get(random.nextInt(videoAdaptors.size())), colors.get(random.nextInt(colors.size())), 
                random.nextInt(100, 2000));               
                notebooks.add(nb);
            }
            System.out.println(notebooks);
            // List<Notebook> res = notebooks;
            for(String item : criterias){
                if(notebooks.isEmpty()) break;
                System.out.println(collectByCreteria(notebooks, item));
                // notebooks.clear();
                // notebooks = res;
                // System.out.println(notebooks);

            }
        
        }
        public static List<Notebook> collectByCreteria(List<Notebook> notebooks, String criteria){
            List<Notebook> temp = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);
            System.out.printf("Chose %s (y/n): ", criteria);
            String yn = scanner.nextLine();
            if(yn.equals("y")) {
                System.out.printf("Enter value: ");
                String value = scanner.nextLine();
                
                for(Notebook nb : notebooks){
                    
                    if(criteria.equals("name")) {
                        if((nb.getName().toUpperCase().equals(value.toUpperCase()))) temp.add(nb);
                    }
                    else if(criteria.equals("color")) {
                        if((nb.getColour().toUpperCase().equals(value.toUpperCase())))
                        temp.add(nb);
                        
                    }
                    else if(criteria.equals("CPU")) {
                        if((nb.getCpu().toUpperCase().equals(value.toUpperCase()))) temp.add(nb);
                    }
                    else if(criteria.equals("ROM")) {
                        if((Integer.toString(nb.getRom()).equals(value)))
                            temp.add(nb);
                    }
                    else if(criteria.equals("HDD")) {
                        if((Integer.toString(nb.getHdd()).equals(value)))
                            temp.add(nb);
                    }
                    else if(criteria.toLowerCase().equals("Video")) {
                        if(nb.getVideo().toUpperCase().equals(value.toUpperCase()))
                            temp.add(nb);
                    }               
                }  
                scanner.close();             
            }
            else {
                scanner.close();
                return temp;
            }
            
            // System.out.println(temp);
            return temp;
        }
       

    }
    

