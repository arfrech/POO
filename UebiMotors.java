public class UebiMotors{
    public static void main (String args[]){

        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.marca = "Chevrolet";
        carro1.modelo = "Corsa";
        carro1.ano = 1995;
        carro1.cor = "Azul";
        carro1.preco = 6500.00;
        carro1.licenciado = true;
        carro1.ipvaPago = true;

        carro2.marca = "Porshe";
        carro2.modelo = "Cayenne";
        carro2.ano = 2021;
        carro2.cor = "Branco";
        carro2.preco = 375000.00;
        carro2.licenciado = true;
        carro2.ipvaPago = true;
    }
}