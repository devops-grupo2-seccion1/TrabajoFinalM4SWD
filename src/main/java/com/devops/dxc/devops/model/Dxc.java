package com.devops.dxc.devops.model;

import java.io.Serializable;

public class Dxc implements Serializable {

    private static final long serialVersionUID = -2988002029080131424L;

    private int sueldo;
    private int ahorro;
    private double uf;
    private int dxc;
    private int saldo;
    private int impuesto;

    public Dxc() {
    }

    public Dxc(int ahorro, int sueldo) {
        this.ahorro = ahorro;
        this.sueldo = sueldo;
    }

    public void calcular() {
        this.uf = Util.getUf();
        this.dxc = Util.getDxc(ahorro, uf);
        this.saldo = this.ahorro - this.dxc;
        this.impuesto = Util.getImpuesto(this.dxc);
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getAhorro() {
        return ahorro;
    }

    public void setAhorro(int ahorro) {
        this.ahorro = ahorro;
    }

    public double getUf() {
        return uf;
    }

    public void setUf(double uf) {
        this.uf = uf;
    }

    public int getDxc() {
        return dxc;
    }

    public void setDxc(int dxc) {
        this.dxc = dxc;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(int impuesto) {
        this.impuesto = impuesto;
    }
}
