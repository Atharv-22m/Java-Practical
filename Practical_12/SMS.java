class SMS{
    static SMS[][] database = new SMS[120][10];
    static int cse, it, mech, chem, civil, textile, elec, instru, entc, prod;
    static int cse1, it1, mech1, chem1, civil1, textile1, elec1, instru1, entc1, prod1;

    String[] info;
    String name, branch, age, year_type;
    String reg_no, email;

    SMS(String data){
        info = data.split(",");
        this.name = info[0];
        this.branch = info[1];
        this.age = info[2];
        this.year_type = info[3];

        if(year_type.toLowerCase().equals("regular")){
            switch(branch.toUpperCase()){
                case "CSE":
                    this.reg_no = "2023BCS" + String.format("%03d", ++cse);
                    this.email = this.reg_no.toLowerCase() + "@sggs.ac.in";
                    database[cse-1][0] = this;
                    break;
                case "IT":
                    this.reg_no = "2023BIT" + String.format("%03d", ++it);
                    this.email = this.reg_no.toLowerCase() + "@sggs.ac.in";
                    database[it-1][1] = this;
                    break;
                case "ENTC":    
                    this.reg_no = "2023BEC" + String.format("%03d", ++entc);
                    this.email = this.reg_no.toLowerCase() + "@sggs.ac.in";
                    database[entc-1][8] = this;
                    break;
                case "MECH":
                    this.reg_no = "2023BME" + String.format("%03d", ++mech);
                    this.email = this.reg_no.toLowerCase() + "@sggs.ac.in";
                    database[mech-1][2] = this;
                    break;
                case "CHEM":    
                    this.reg_no = "2023BCH" + String.format("%03d", ++chem);
                    this.email = this.reg_no.toLowerCase() + "@sggs.ac.in";
                    database[chem-1][3] = this;
                    break;
                case "CIVIL":        
                    this.reg_no = "2023BCE" + String.format("%03d", ++civil);
                    this.email = this.reg_no.toLowerCase() + "@sggs.ac.in";
                    database[civil-1][4] = this;
                    break;
                case "TEXTILE":                
                    this.reg_no = "2023BTT" + String.format("%03d", ++textile);
                    this.email = this.reg_no.toLowerCase() + "@sggs.ac.in";
                    database[textile-1][5] = this;
                    break;
                case "ELEC":    
                    this.reg_no = "2023BEL" + String.format("%03d", ++elec);
                    this.email = this.reg_no.toLowerCase() + "@sggs.ac.in";
                    database[elec-1][6] = this;
                    break;
                case "INSTRU":            
                    this.reg_no = "2023BIN" + String.format("%03d", ++instru);
                    this.email = this.reg_no.toLowerCase() + "@sggs.ac.in";
                    database[instru-1][7] = this;
                    break;
                case "PROD":    
                    this.reg_no = "2023BPE" + String.format("%03d", ++prod);
                    this.email = this.reg_no.toLowerCase() + "@sggs.ac.in";
                    database[prod-1][9] = this;
                    break;
                default:
                    System.out.println("Provide valid input");
                    break;
            }
        }
        else if(year_type.toLowerCase().equals("dsy")){
            switch(branch.toUpperCase()){
                case "CSE":
                    this.reg_no = "2023BCS5" + String.format("%02d", ++cse1);
                    this.email = this.reg_no.toLowerCase() + "@sggs.ac.in";
                    database[cse1-1][0] = this;
                    break;
                case "IT":
                    this.reg_no = "2023BIT5" + String.format("%02d", ++it1);
                    this.email = this.reg_no.toLowerCase() + "@sggs.ac.in";
                    database[it1-1][1] = this;
                    break;
                case "ENTC":    
                    this.reg_no = "2023BEC5" + String.format("%02d", ++entc1);
                    this.email = this.reg_no.toLowerCase() + "@sggs.ac.in";
                    database[entc1-1][8] = this;
                    break;
                case "MECH":
                    this.reg_no = "2023BME5" + String.format("%02d", ++mech1);
                    this.email = this.reg_no.toLowerCase() + "@sggs.ac.in";
                    database[mech1-1][2] = this;
                    break;
                case "CHEM":    
                    this.reg_no = "2023BCH5" + String.format("%02d", ++chem1);
                    this.email = this.reg_no.toLowerCase() + "@sggs.ac.in";
                    database[chem1-1][3] = this;
                    break;
                case "CIVIL":        
                    this.reg_no = "2023BCE5" + String.format("%02d", ++civil1);
                    this.email = this.reg_no.toLowerCase() + "@sggs.ac.in";
                    database[civil1-1][4] = this;
                    break;
                case "TEXTILE":                
                    this.reg_no = "2023BTT5" + String.format("%02d", ++textile1);
                    this.email = this.reg_no.toLowerCase() + "@sggs.ac.in";
                    database[textile1-1][5] = this;
                    break;
                case "ELEC":   
                    this.reg_no = "2023BEL5" + String.format("%02d", ++elec1);
                    this.email = this.reg_no.toLowerCase() + "@sggs.ac.in";
                    database[elec1-1][6] = this;
                    break;
                case "INSTRU":            
                    this.reg_no = "2023BIN5" + String.format("%02d", ++instru1);
                    this.email = this.reg_no.toLowerCase() + "@sggs.ac.in";
                    database[instru1-1][7] = this;
                    break;
                case "PROD":    
                    this.reg_no = "2023BPE5" + String.format("%02d", ++prod1);
                    this.email = this.reg_no.toLowerCase() + "@sggs.ac.in";
                    database[prod1-1][9] = this;
                    break;
                default:
                    System.out.println("Provide valid input");
                    break;
            }     
        }
        System.out.println("\nName: " + this.name + "\nReg.No.: " + this.reg_no + "\nEmail: " + this.email + "\nBranch: " + this.branch.toUpperCase() + "\nAge: " + this.age + "\nYear type: " + this.year_type.toUpperCase());
    }

    public static void main(String[] args){
        if (args.length > 0) {
            for (int i = 0; i < args.length; i++) {
                SMS s = new SMS(args[i]);
            }
        } else {
            System.out.println("No arguments provided.");
        }
    }
}

// "Prathamesh,it,19,Dsy" "Sahil,mech,19,regular" "Atharv,it,19,dsy" "Mayur,elec,19,regular"
