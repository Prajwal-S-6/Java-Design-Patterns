package org.example.mediator;


public class TextBox extends TextField implements UIControl{
	private UIMediator uiMediator;
	private boolean mediatorUpdate;
	public TextBox(UIMediator uiMediator) {
		this.uiMediator = uiMediator;
		this.setText("Textbox");
		uiMediator.register(this);
		this.valueProperty().addListener((v,o,n) ->{if(!mediatorUpdate) this.uiMediator.valueChanged(this);});
	}

	@Override
	public void controlChanged(UIControl control) {
		this.mediatorUpdate = true;
		this.setText(control.getControlValue());
		this.mediatorUpdate = false;
	}

	@Override
	public String getControlValue() {
		return this.getTextValue();
	}

	@Override
	public String getControlName() {
		return "TextControl";
	}
}
