package com.colobu.rpcx.rpc.impl;

import com.colobu.rpcx.rpc.Invocation;
import com.colobu.rpcx.rpc.Invoker;
import com.google.gson.annotations.Expose;

import java.io.Serializable;
import java.util.Map;

public class RpcInvocation implements Invocation,Serializable {

    @Expose
    private String className;

    @Expose
    private String methodName;

    private Class<?>[] parameterTypes;

    private Class<?> resultType;

    @Expose
    public String[] parameterTypeNames;

    @Expose
    private Object[] arguments;

    @Expose
    private Map<String, String> attachments;

    private transient Invoker<?> invoker;

    public RpcInvocation() {
    }


    @Override
    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    @Override
    public Class<?>[] getParameterTypes() {
        return parameterTypes;
    }

    @Override
    public String[] getParameterTypeNames() {
        return this.parameterTypeNames;
    }

    public void setParameterTypes(Class<?>[] parameterTypes) {
        this.parameterTypes = parameterTypes;
    }

    @Override
    public Object[] getArguments() {
        return arguments;
    }

    public void setArguments(Object[] arguments) {
        this.arguments = arguments;
    }

    @Override
    public Map<String, String> getAttachments() {
        return attachments;
    }

    @Override
    public String getAttachment(String key) {
        return null;
    }

    @Override
    public String getAttachment(String key, String defaultValue) {
        return null;
    }

    public void setAttachments(Map<String, String> attachments) {
        this.attachments = attachments;
    }

    @Override
    public Invoker<?> getInvoker() {
        return invoker;
    }

    public void setInvoker(Invoker<?> invoker) {
        this.invoker = invoker;
    }

    @Override
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Class<?> getResultType() {
        return resultType;
    }

    public void setResultType(Class<?> resultType) {
        this.resultType = resultType;
    }

    public void setParameterTypeNames(String[] parameterTypeNames) {
        this.parameterTypeNames = parameterTypeNames;
    }
}