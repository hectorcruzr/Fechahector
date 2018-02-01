package bo.edu.umss.cs.ceis;

public class Fecha {
    int dia;
    int mes;
    int anio;
    public Fecha(int a,int b,int c){
        dia=a;
        mes=b;
        anio=c;
    }
    public void mostrarFechaCorta(){
        System.out.println(dia+"/"+mes+"/"+anio);
    }
    public void mostrarFechaLarga(){
        System.out.println(mostrarDia(dia)+" de "+mostrarMes(mes)+" del "+mostrarAnio(anio));
    }

    public String mostrarMes(int mes) {
        String mesString="";
        switch (mes) {
            case 1:  mesString = "Enero";
                break;
            case 2:  mesString = "Febrero";
                break;
            case 3:  mesString = "Marzo";
                break;
            case 4:  mesString = "Abril";
                break;
            case 5:  mesString = "Mayo";
                break;
            case 6:  mesString = "Junio";
                break;
            case 7:  mesString = "Julio";
                break;
            case 8:  mesString = "Agosto";
                break;
            case 9:  mesString = "September";
                break;
            case 10: mesString = "October";
                break;
            case 11: mesString = "November";
                break;
            case 12: mesString = "December";
                break;
            default: mesString = "mes invalido";
                break;
        }
        return mesString;
    }
    public String mostrarDia(int dia) {
        String diaString="";
        switch (dia) {
            case 1:  diaString = "Uno";
                break;
            case 2:  diaString = "Dos";
                break;
            case 3:  diaString = "Tres";
                break;
            case 4:  diaString = "Cuatro";
                break;
            case 5:  diaString = "Cinco";
                break;
            case 6:  diaString = "Seis";
                break;
            case 7:  diaString = "Siete";
                break;
            case 8:  diaString = "Ocho";
                break;
            case 9:  diaString = "Nueve";
                break;
            case 10: diaString = "Diez";
                break;
            case 11: diaString = "Once";
                break;
            case 12: diaString = "Doce";
                break;
            case 13: diaString = "Trece";
                break;
            case 14: diaString = "Catorce";
                break;
            case 15: diaString = "Quince";
                break;
            case 16: diaString = "Diez y Seis";
                break;
            case 17: diaString = "Diez y Siete";
                break;
            case 18: diaString = "Diez y Ocho";
                break;
            case 19: diaString = "Diez y Nueve";
                break;
            case 20: diaString = "Veinte";
                break;
            case 21: diaString = "Veintyuno ";
                break;
            case 22: diaString = "Veintidos";
                break;
            case 23: diaString = "Veintitres";
                break;
            case 24: diaString = "Veinticuatro";
                break;
            case 25: diaString = "Veinticinco";
                break;
            case 26: diaString = "Veintiseis";
                break;
            case 27: diaString = "Veintisiete";
                break;
            case 28: diaString = "Veintiochoo";
                break;
            case 29: diaString = "Veintinueve";
                break;
            case 30: diaString = "Treinta";
                break;
            case 31: diaString = "Treintayuno";
                break;
            default: diaString = "dia invalido";
                break;
        }
        return diaString;
    }
    public String mostrarAnio(int anio) {
        String anioString="";
        if((anio<1980)&&(anio>2020))
            anioString="invalido anio";
        return anio+"";
    }
}
