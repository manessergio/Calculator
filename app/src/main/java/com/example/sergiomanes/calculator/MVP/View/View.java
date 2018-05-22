package com.example.sergiomanes.calculator.MVP.View;


import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.sergiomanes.calculator.R;
import com.squareup.otto.Bus;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class View extends ActivityView{

    private Bus bus;

    @BindView(R.id.button0) Button button0;
    @BindView(R.id.button1) Button button1;
    @BindView(R.id.button2) Button button2;
    @BindView(R.id.button3) Button button3;
    @BindView(R.id.button4) Button button4;
    @BindView(R.id.button5) Button button5;
    @BindView(R.id.button6) Button button6;
    @BindView(R.id.button7) Button button7;
    @BindView(R.id.button8) Button button8;
    @BindView(R.id.button9) Button button9;
    @BindView(R.id.buttonPlus) Button buttonPlus;
    @BindView(R.id.buttonMinus) Button buttonMinus;
    @BindView(R.id.buttonDiv) Button buttonDiv;
    @BindView(R.id.buttonMultip) Button buttonMultip;
    @BindView(R.id.buttonReset) Button buttonReset;
    @BindView(R.id.buttonResult) Button buttonResult;
    @BindView(R.id.textViewResult) EditText textResult;
    @BindView(R.id.signIndicator) TextView textViewSign;

    public View(Activity activity, Bus bus) {
        super(activity);
        this.bus=bus;
        ButterKnife.bind(this, activity);
    }

    public void setTextResult(String text) {

        this.textResult.setText(text);
    }

    public String getTextResult() {

       return this.textResult.getText().toString();
}

    public String getTextViewSign() {
        return textViewSign.getText().toString();
    }

    public void setTextViewSign(String textViewSign) {
        this.textViewSign.setText(textViewSign);
    }

    @OnClick(R.id.button0)
    public void pressed0()
    {
        bus.post(new button0Event());
    }

    @OnClick(R.id.button1)
    public void pressed1()
    {
        bus.post(new button1Event());
    }

    @OnClick(R.id.button2)
    public void pressed2()
    {
        bus.post(new button2Event());
    }

    @OnClick(R.id.button3)
    public void pressed3()
    {
        bus.post(new button3Event());
    }

    @OnClick(R.id.button4)
    public void pressed4()
    {
        bus.post(new button4Event());
    }

    @OnClick(R.id.button5)
    public void pressed5()
    {
        bus.post(new button5Event());
    }

    @OnClick(R.id.button6)
    public void pressed6()
    {
        bus.post(new button6Event());
    }

    @OnClick(R.id.button7)
    public void pressed7()
    {
        bus.post(new button7Event());
    }

    @OnClick(R.id.button8)
    public void pressed8()
    {
        bus.post(new button8Event());
    }

    @OnClick(R.id.button9)
    public void pressed9()
    {
        bus.post(new button9Event());
    }

    @OnClick(R.id.buttonPlus)
    public void pressedPlus()
    {
        bus.post(new buttonPlusEvent());
    }

    @OnClick(R.id.buttonMinus)
    public void pressedMinus()
    {
        bus.post(new buttonMinusEvent());
    }

    @OnClick(R.id.buttonMultip)
    public void pressedMultip()
    {
        bus.post(new buttonMultipEvent());
    }

    @OnClick(R.id.buttonDiv)
    public void pressedDiv()
    {
        bus.post(new buttonDivEvent());
    }

    @OnClick(R.id.buttonReset)
    public void pressedReset()
    {
        bus.post(new buttonResetEvent());
    }

    @OnClick(R.id.buttonResult)
    public void pressedResult()
    {
        bus.post(new buttonResultEvent());
    }

    public class button0Event {
    }
    public class button1Event {
    }
    public class button2Event {
    }
    public class button3Event {
    }
    public class button4Event {
    }
    public class button5Event {
    }
    public class button6Event {
    }
    public class button7Event {
    }
    public class button8Event {
    }
    public class button9Event {
    }
    public class buttonPlusEvent {
    }
    public class buttonMinusEvent {
    }
    public class buttonMultipEvent {
    }
    public class buttonDivEvent {
    }
    public class buttonResetEvent {
    }
    public class buttonResultEvent {
    }
}
