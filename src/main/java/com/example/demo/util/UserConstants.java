package com.example.demo.util;

public class UserConstants {

	public static final String CONTROLLER_ROOT_PATH = "V5";

	// Error Codes
	public static final Integer SuccessCode = 200;
	public static final Integer ErrorCode = 400; // bad input
	public static final Integer FailResponseCode = 404;
	public static final Integer TryCatchExceptionCode = 406;
	public static final Integer NoRecordFoundCode = 204;
	public static final Integer AlreadyDataExists = 208;
	public static final Integer InternetServelError = 500;
	public static final String SccessResponseDesc = "Success";
	public static final String BadInputData = "Request failed due to invalid Data";
	public static final String RequestBodyEmpty = "Request failed due to invalid Data";
	public static final String TryCatchErrorDesc = "Error";
	public static final String RecordALreadyPresent = "Record already has been Authorized";
	public static final String InvalidContentTyeErrorDesc = "DECLINED:Invalid ContentType";
	public static final String AuthenticationError = "Authentication Error";
}
