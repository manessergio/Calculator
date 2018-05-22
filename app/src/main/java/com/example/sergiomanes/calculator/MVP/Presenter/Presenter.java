package com.example.sergiomanes.calculator.MVP.Presenter;


import com.example.sergiomanes.calculator.MVP.Model.Model;
import com.example.sergiomanes.calculator.MVP.View.View;
import com.squareup.otto.Subscribe;

public class Presenter {

    private Model model;
    private View view;

    public Presenter(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    @Subscribe
    public void pressed0(View.button0Event event)
    {
        view.setTextResult(view.getTextResult() + "0");
    }

    @Subscribe
    public void pressed1(View.button1Event event)
    {
        view.setTextResult(view.getTextResult() + "1");
    }

    @Subscribe
    public void pressed2(View.button2Event event)
    {
        view.setTextResult(view.getTextResult() + "2");
    }

    @Subscribe
    public void pressed3(View.button3Event event)
    {
        view.setTextResult(view.getTextResult() + "3");
    }

    @Subscribe
    public void pressed4(View.button4Event event)
    {
        view.setTextResult(view.getTextResult() + "4");
    }

    @Subscribe
    public void pressed5(View.button5Event event)
    {
        view.setTextResult(view.getTextResult() + "5");
    }

    @Subscribe
    public void pressed6(View.button6Event event)
    {
        view.setTextResult(view.getTextResult() + "6");
    }

    @Subscribe
    public void pressed7(View.button7Event event)
    {
        view.setTextResult(view.getTextResult() + "7");
    }

    @Subscribe
    public void pressed8(View.button8Event event)
    {
        view.setTextResult(view.getTextResult() + "8");
    }

    @Subscribe
    public void pressed9(View.button9Event event)
    {
        view.setTextResult(view.getTextResult() + "9");
    }

    @Subscribe
    public void pressedPlus(View.buttonPlusEvent event)
    {
        this.startOperationWithChosenSign("+");
    }

    @Subscribe
    public void pressedMinus(View.buttonMinusEvent event)
    {
        this.startOperationWithChosenSign("-");
    }

    @Subscribe
    public void pressedMultip(View.buttonMultipEvent event)
    {
        this.startOperationWithChosenSign("*");
    }

    @Subscribe
    public void pressedDiv(View.buttonDivEvent event)
    {
        this.startOperationWithChosenSign("/");
    }

    @Subscribe
    public void pressedResult(View.buttonResultEvent event)
    {
        this.startOperationWithChosenSign("=");
    }

    @Subscribe
    public void pressedReset(View.buttonResetEvent event)
    {
       this.showOnFinalResultText("","N",true);
    }


    // AUXILIARY METHODS

    private void startOperationWithChosenSign(String sign)
    {
        String[] operacion = model.getOperation();
  //      view.setTextViewSign(sign);

        if (operacion[0] == null)
        {
            operacion[1] = sign;
            operacion[0] = view.getTextResult();
            view.setTextResult("");
            view.setTextViewSign(operacion[0]+" "+operacion[1]);
            model.setOperation(operacion);
        }
        else if (operacion[2] == null)
        {
            operacion[2] = view.getTextResult();
            double result = this.result();

            if (sign.equals("="))
            {
                this.showOnFinalResultText(String.valueOf(result), "N", true);
            }
            else
            {
                this.showOnFinalResultText(String.valueOf(result), sign, false);
                operacion[0] = String.valueOf(result);
                operacion[1] = sign;
                operacion[2] = null;
            }
        }
        model.setOperation(operacion);
    }

    private void showOnFinalResultText(String text, String sign, boolean withReset){
        if (withReset)
        {
            view.setTextResult(text);
            view.setTextViewSign("");
            model.reset();
        }
        else
        {
            view.setTextResult("");
            view.setTextViewSign(text + " " + sign);
        }
    }

    private double result (){
        String[] operacion = model.getOperation();
        Double resultado = 0.0;
        if (model.checkArray(operacion))
        {
            switch (operacion[1])
            {
                case "+":
                    resultado = Double.parseDouble(operacion[0])+Double.parseDouble(operacion[2]);
                    break;
                case "-":
                    resultado = Double.parseDouble(operacion[0])-Double.parseDouble(operacion[2]);
                    break;
                case "*":
                    resultado = Double.parseDouble(operacion[0])*Double.parseDouble(operacion[2]);
                    break;
                case "/":
                    resultado = Double.parseDouble(operacion[0])/Double.parseDouble(operacion[2]);
                    break;
            }
        }
        return resultado;
    }



}
