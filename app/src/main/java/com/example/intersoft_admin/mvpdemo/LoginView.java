package com.example.intersoft_admin.mvpdemo;

/**
 * The Interface LoginView.
 */
public interface LoginView {
    /**
	 * Show validation error.
	 */
	void showValidationError();
	/**
	 * Login success.
	 */
	void loginSuccess();
	/**
	 * Login error.
	 */
	void loginError();
}