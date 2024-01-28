package com.experiment.order.modules;

import jakarta.annotation.Nullable;

import java.util.List;

public class ResponseWrapper<S,T> {
    public int status;
    public String message;

    public S data;

    public List<T> datas;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public S getData() {
        return data;
    }

    public void setData(S data) {
        this.data = data;
    }

    public List<T> getDatas() {
        return datas;
    }

    public void setDatas(List<T> datas) {
        this.datas = datas;
    }
}
