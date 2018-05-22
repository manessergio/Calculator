package com.example.sergiomanes.calculator.MVP.Model;

public class Model {
    private String[] operation;

    public Model() {
        this.operation = new String[3];
        this.reset();
    }

    public String[] getOperation() {
        return operation;
    }

    public void reset()
    {
        for(int i=0;i<=2;i++)
        {
            operation[i]=null;
        }
    }

    public void setOperation(String[] operation) {
        this.operation = operation;
    }

    public boolean checkArray(String[] operacion) {
        boolean arrayWithoutNull = true;
        int i = 0;
        do
        {
            if (operacion[i] == null)
            {
                arrayWithoutNull = false;
            }
            else
            {
                i++;
            }
        }
        while ((i<3) && (arrayWithoutNull));

        return arrayWithoutNull;
    }


}
