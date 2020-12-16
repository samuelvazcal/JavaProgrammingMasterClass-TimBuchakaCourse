package com.samuelvazquez;

public class Button {
	private String title;
	private OnClickListener onClickListener;

	public Button(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	//function to set our click listener
	public void setOnClickListener(OnClickListener onClickListener) {
		this.onClickListener = onClickListener;
	}

	//function to handle the click
	public void onClick() {
		this.onClickListener.onClick(this.title);
	}

	public interface OnClickListener {
		public void onClick(String title);
	}
}
