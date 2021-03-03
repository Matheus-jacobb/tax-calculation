package entities;

public class personpj extends people{

    private int numberEmployee;

    public personpj(String name, double annualIncome, int numberEmployee) {
        super(name, annualIncome);
        this.numberEmployee = numberEmployee;
    }

    public int getNumberEmployee() {
        return numberEmployee;
    }

    public void setNumberEmployee(int numberEmployee) {
        this.numberEmployee = numberEmployee;
    }

    @Override
    public double tax() {
        if (this.numberEmployee >10){
            return (getAnnualIncome() * 0.14);
        }
        else{
            return (getAnnualIncome() * 0.16);
        }
    }
    
}
