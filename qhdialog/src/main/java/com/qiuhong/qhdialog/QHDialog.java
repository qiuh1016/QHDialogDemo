package com.qiuhong.qhdialog;

import android.content.Context;
import android.content.DialogInterface;

/**
 * Created by qiuhong on 9/8/16.
 */
public class QHDialog {

    private QHDialogClass qhDialog;
    private QHDialogClass.Builder builder;
    private boolean cancelable = true;
    private Context context;
    private String title = "";
    private String message = "";

    public QHDialog(Context context) {
        this.context = context;
        builder = new QHDialogClass.Builder(context);
    }

    public QHDialog(Context context, String title, String message) {
        this.context = context;
        this.title = title;
        this.message = message;
        builder = new QHDialogClass.Builder(context);
    }

    public void show() {
        builder.setTitle(title);
        builder.setMessage(message);
        builder.setCancelable(cancelable);
        qhDialog = builder.create();
        qhDialog.show();

    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setPositiveButton(String text, DialogInterface.OnClickListener listener) {
        builder.setPositiveButton(text, listener);
    }

    public void setNegativeButton(String text, DialogInterface.OnClickListener listener) {
        builder.setNegativeButton(text, listener);
    }

    public void setCancelable(boolean cancelable) {
        builder.setCancelable(cancelable);
    }



}
