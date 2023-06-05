package com.autotweak.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import javax.swing.JOptionPane;

import com.autotweak.model.entities.Car;
import com.autotweak.model.entities.enums.TypeCar;

public class Program {
	
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List <Car> car = new ArrayList<>(); 
		
		String colorOption;
		int breakType=0, steeringType=0, exhaustType=0, seatType=0, shiftType=0,exitProgram=0;// TIPOS DE OPÇÕES DO PROGRAMA
		double budget=0;//ORÇAMENTO DO USUÁRIO
		int custom = Integer.parseInt(JOptionPane.showInputDialog(null, "BEM VINDO AO AUTO_TWEAK!' 🚗 \nDigite quantos carros deseja modificar: "));
		while (exitProgram!=4) {
			
			int menu = Integer.parseInt(JOptionPane.showInputDialog(null, "--------[AUTO_TWEAK 🚗]--------\n"
					+ "1- Propriedades de direção \n"
					+ "2- Listar recomendações \n"
					+ "3- Mostrar suas predefinições\n"
					+ "4- Sair ( X )"));
						
			for(int i=0;i<custom;i++) {
				
				switch (menu) { // ENTRADA DE DADOS DO USUÁRIO PARA A DEVIDA RECOMENDAÇÃO
				case 1:
					budget = Double.parseDouble(JOptionPane.showInputDialog(null, "Defina o seu orçamento em R$: \n"));
					String typeCarOption = JOptionPane.showInputDialog(null, "Selecione o tipo de carro: \n"
							+ "SEDAN \n"
							+ "HATCH \n"
							+ "SUV \n"
							+ "CUPE \n"
							+ "CONVERSIVEL \n"
							+ "PICKUP \n"
							+ "ELETRICO");
					colorOption = JOptionPane.showInputDialog(null, "Selecione a cor do seu carro: \n");
					
					breakType = Integer.parseInt(JOptionPane.showInputDialog(null, "Selecione o tipo de freio do seu carro: \n"
							+ "1-ABS\n"
							+ "2-DISCO\n"
							+ "3-TAMBOR\n"));
					
					steeringType = Integer.parseInt(JOptionPane.showInputDialog(null, "Selecione o tipo de direção: \n"
							+ "1-HIDRAULICA\n"
							+ "2-ELÉTRICA\n"
							+ "3-MECANICA\n"));
					
					exhaustType = Integer.parseInt(JOptionPane.showInputDialog(null, "Selecione o tipo de escapamento do seu carro: \n"
							+ "1-FÁBRICA\n"
							+ "2-ESPORTIVO\n"
							+ "3-DESEMPENHO\n"));
					
					seatType = Integer.parseInt(JOptionPane.showInputDialog(null, "Selecione o tipo de banco do seu carro: \n"
							+ "1-ESPORTIVO\n"
							+ "2-COURO\n"
							+ "3-DOBRÁVEL\n"));
					
					shiftType = Integer.parseInt(JOptionPane.showInputDialog(null, "Selecione o tipo de cambio do seu carro: \n"
							+ "1-MANUAL\n"
							+ "2-AUTOMÁTICO\n"));
					
				car.add(new Car(TypeCar.valueOf(typeCarOption),/*
				
				*ADICIONA OS DADOS DO USUÁRIO EM UMA LISTA PARA CONSULTA E GERAÇÃO DA RECOMENDAÇÃO
				*TENDO COMO PADRÃO COR, TIPO DE FREIO, DIREÇÃO, ESCAPAMENTO, BANCO, CAMBIO E ORÇAMENTO
				*/
						colorOption,
						breakType,
						steeringType,
						exhaustType,
						seatType,
						shiftType,
						budget)); 
				break;
					
				case 2:
					if (breakType==1) {
						
						if (budget<700 && budget>=500) {//TIPO DE FREIO ABS PELO DETERMINADO ORÇAMENTO
							JOptionPane.showMessageDialog(null, "Disco De Freio - Topic Jinbei 5 Furos - Abs [R$ 570,00]\n");
						}
						else if (budget<1000 && budget>=700) {
							JOptionPane.showMessageDialog(null, "Disco De Freio - Topic Jinbei 5 Furos - Abs [R$ 570,00]\n"
									+ "Kit Disco + Pastilha Freio Dianteiro S10 / Blazer 97/11 4x2 - Abs [R$ 790,00]\n ");
						}
						else if (budget>1000) {
							JOptionPane.showMessageDialog(null, "Disco De Freio - Topic Jinbei 5 Furos - Abs [R$ 570,00]\n"
									+ "Kit Disco + Pastilha Freio Dianteiro S10 / Blazer 97/11 4x2 - Abs [R$ 790,00]\n"
									+ "Disco Freio Dianteiro Grand Cherokee 3.6 V6 24v 2010 2011 - [R$ 1.197,00]");
						}
					}
					
					else if (breakType==2) { //TIPO DE FREIO A DISCO PELO DETERMINADO ORÇAMENTO
						if (budget<700 && budget>=500) {
							JOptionPane.showMessageDialog(null, "Disco De Freio - Topic Jinbei 5 Furos - Abs [R$ 570,00]\n");
						}
						else if (budget<1000 && budget>=700) {
							JOptionPane.showMessageDialog(null, "Disco De Freio - Topic Jinbei 5 Furos - Abs [R$ 570,00]\n"
									+ "Kit Disco + Pastilha Freio Dianteiro S10 / Blazer 97/11 4x2 - Abs [R$ 790,00]\n ");
						}
						else if (budget>1000) {
							JOptionPane.showMessageDialog(null, "Disco De Freio - Topic Jinbei 5 Furos - Abs [R$ 570,00]\n"
									+ "Kit Disco + Pastilha Freio Dianteiro S10 / Blazer 97/11 4x2 - Abs [R$ 790,00]\n"
									+ "Disco Freio Dianteiro Grand Cherokee 3.6 V6 24v 2010 2011 - [R$ 1.197,00]");
						}
					}
					else if (breakType==3) { //TIPO DE FREIO A TAMBOR PELO DETERMINADO ORÇAMENTO
						if (budget<500 && budget>=300) {
							JOptionPane.showMessageDialog(null, "Tambor Freio Para Effa Van E Picape Cara Chata - Tambor [R$ 370,00]\n");
						}
						else if (budget<5500 && budget>=700) {
							JOptionPane.showMessageDialog(null, "Tambor Freio Para Effa Van E Picape Cara Chata - Tambor [R$ 370,00]\n"
									+ "Par Tambor De Freio L200 Triton Savana 3.2 2012 A 2016 - Tambor [R$ 5.158,00]\n ");
						}
						else if (budget>5500) {
							JOptionPane.showMessageDialog(null, "Tambor Freio Para Effa Van E Picape Cara Chata - Tambor [R$ 370,00]\n"
									+ "Par Tambor De Freio L200 Triton Savana 3.2 2012 A 2016 - Tambor [R$ 5.158,00]\n"
									+ "Cubo/cartola Montado Mb Axor Freio Tambor-3463504109 - Tambor [R$ 6.990,00]");
						}
					}
					if (steeringType==1) {////TIPO DE DIREÇÃO HIDAULICA
						
						if (budget<700 && budget>=500) {
							JOptionPane.showMessageDialog(null, "Caixa Direcao Nova Corolla 2015/2019 - Hidraulica [R$ 1.383,00]\n");
						}
						else if (budget<1000 && budget>=700) {
							JOptionPane.showMessageDialog(null, "Caixa Direcao Nova Corolla 2015/2019 - Hidraulica [R$ 1.383,00]\n"
									+ "Caixa Direçao Hidraulica Renault Master 2.5 2.8 - Hidraulica [R$ 2.139,00]\n ");
						}
						else if (budget>1000) {
							JOptionPane.showMessageDialog(null, "Caixa Direcao Nova Corolla 2015/2019 - Hidraulica [R$ 1.383,00]\n"
									+ "Caixa Direçao Hidraulica Renault Master 2.5 2.8 - Hidraulica [R$ 2.139,00]\n"
									+ "Caixa Direcao Hidraulica Ranger 2001/2012 2.3 2.8 3.0 4.0 - Hidraulica [R$ 1.197,00]");
						}
					}
					
					else if (steeringType==2) { //TIPO DE DIREÇÃO ELETRICA
						if (budget<700 && budget>=500) {
							JOptionPane.showMessageDialog(null, "Coluna Direção Elétrica Onix/prisma/ Spin/cobalt 2017 A 2020 - Eletrica [R$ 790,00]\n");
						}
						else if (budget<1000 && budget>=700) {
							JOptionPane.showMessageDialog(null, "Coluna Direção Elétrica Onix/prisma/ Spin/cobalt 2017 A 2020 - Eletrica [R$ 790,00]\n"
									+ "Caixa Direcao Eletrica Argo 2018 2019 2020 2021 2022 1.0 1.3 - Eletrica [R$ 1.323]\n ");
						}
						else if (budget>1000) {
							JOptionPane.showMessageDialog(null, "Coluna Direção Elétrica Onix/prisma/ Spin/cobalt 2017 A 2020 - Eletrica [R$ 790,00]\n"
									+ "Caixa Direcao Eletrica Argo 2018 2019 2020 2021 2022 1.0 1.3 - Eletrica [R$ 1.323]\n"
									+ "Caixa De Direcao Elétrica Nissan March 2011 2012 2013 2014 - ELetrica [R$ 1.337,00]");
						}
					}
					else if (steeringType==3) { //TIPO DE DIREÇÃO MECÂNICA
						if (budget<500 && budget>=300) {
							JOptionPane.showMessageDialog(null, "Tambor Freio Para Effa Van E Picape Cara Chata - Tambor [R$ 370,00]\n");
						}
						else if (budget<5500 && budget>=700) {
							JOptionPane.showMessageDialog(null, "Tambor Freio Para Effa Van E Picape Cara Chata - Tambor [R$ 370,00]\n"
									+ "Par Tambor De Freio L200 Triton Savana 3.2 2012 A 2016 - Tambor [R$ 5.158,00]\n ");
						}
						else if (budget>5500) {
							JOptionPane.showMessageDialog(null, "Tambor Freio Para Effa Van E Picape Cara Chata - Tambor [R$ 370,00]\n"
									+ "Par Tambor De Freio L200 Triton Savana 3.2 2012 A 2016 - Tambor [R$ 5.158,00]\n"
									+ "Cubo/cartola Montado Mb Axor Freio Tambor-3463504109 - Tambor [R$ 6.990,00]");
						}
					}
					if (exhaustType==1) {//TIPO DE ESCAPAMENTO DE FÁBRICA 
						
						if (budget<700 && budget>=500) {
							JOptionPane.showMessageDialog(null, "Disco De Freio - Topic Jinbei 5 Furos - Abs [R$ 570,00]\n");
						}
						else if (budget<1000 && budget>=700) {
							JOptionPane.showMessageDialog(null, "Disco De Freio - Topic Jinbei 5 Furos - Abs [R$ 570,00]\n"
									+ "Kit Disco + Pastilha Freio Dianteiro S10 / Blazer 97/11 4x2 - Abs [R$ 790,00]\n ");
						}
						else if (budget>1000) {
							JOptionPane.showMessageDialog(null, "Disco De Freio - Topic Jinbei 5 Furos - Abs [R$ 570,00]\n"
									+ "Kit Disco + Pastilha Freio Dianteiro S10 / Blazer 97/11 4x2 - Abs [R$ 790,00]\n"
									+ "Disco Freio Dianteiro Grand Cherokee 3.6 V6 24v 2010 2011 - [R$ 1.197,00]");
						}
					}
					
					else if (exhaustType==2) { //TIPO DE ESCAPAMENTO ESPORTIVO 
						if (budget<700 && budget>=500) {
							JOptionPane.showMessageDialog(null, "Disco De Freio - Topic Jinbei 5 Furos - Abs [R$ 570,00]\n");
						}
						else if (budget<1000 && budget>=700) {
							JOptionPane.showMessageDialog(null, "Disco De Freio - Topic Jinbei 5 Furos - Abs [R$ 570,00]\n"
									+ "Kit Disco + Pastilha Freio Dianteiro S10 / Blazer 97/11 4x2 - Abs [R$ 790,00]\n ");
						}
						else if (budget>1000) {
							JOptionPane.showMessageDialog(null, "Disco De Freio - Topic Jinbei 5 Furos - Abs [R$ 570,00]\n"
									+ "Kit Disco + Pastilha Freio Dianteiro S10 / Blazer 97/11 4x2 - Abs [R$ 790,00]\n"
									+ "Disco Freio Dianteiro Grand Cherokee 3.6 V6 24v 2010 2011 - [R$ 1.197,00]");
						}
					}
					else if (exhaustType==3) {//TIPO DE ESCAPAMENTO DE DESEMPENHO 
						if (budget<500 && budget>=300) {
							JOptionPane.showMessageDialog(null, "Tambor Freio Para Effa Van E Picape Cara Chata - Tambor [R$ 370,00]\n");
						}
						else if (budget<5500 && budget>=700) {
							JOptionPane.showMessageDialog(null, "Tambor Freio Para Effa Van E Picape Cara Chata - Tambor [R$ 370,00]\n"
									+ "Par Tambor De Freio L200 Triton Savana 3.2 2012 A 2016 - Tambor [R$ 5.158,00]\n ");
						}
						else if (budget>5500) {
							JOptionPane.showMessageDialog(null, "Tambor Freio Para Effa Van E Picape Cara Chata - Tambor [R$ 370,00]\n"
									+ "Par Tambor De Freio L200 Triton Savana 3.2 2012 A 2016 - Tambor [R$ 5.158,00]\n"
									+ "Cubo/cartola Montado Mb Axor Freio Tambor-3463504109 - Tambor [R$ 6.990,00]");
						}
					}
					if (seatType==1) {//TIPO DE BANCO ESPORTIVO
						
						if (budget<700 && budget>=500) {
							JOptionPane.showMessageDialog(null, "Disco De Freio - Topic Jinbei 5 Furos - Abs [R$ 570,00]\n");
						}
						else if (budget<1000 && budget>=700) {
							JOptionPane.showMessageDialog(null, "Disco De Freio - Topic Jinbei 5 Furos - Abs [R$ 570,00]\n"
									+ "Kit Disco + Pastilha Freio Dianteiro S10 / Blazer 97/11 4x2 - Abs [R$ 790,00]\n ");
						}
						else if (budget>1000) {
							JOptionPane.showMessageDialog(null, "Disco De Freio - Topic Jinbei 5 Furos - Abs [R$ 570,00]\n"
									+ "Kit Disco + Pastilha Freio Dianteiro S10 / Blazer 97/11 4x2 - Abs [R$ 790,00]\n"
									+ "Disco Freio Dianteiro Grand Cherokee 3.6 V6 24v 2010 2011 - [R$ 1.197,00]");
						}
					}
					
					else if (seatType==2) { //TIPO DE BANCO DE COURO
						if (budget<700 && budget>=500) {
							JOptionPane.showMessageDialog(null, "Disco De Freio - Topic Jinbei 5 Furos - Abs [R$ 570,00]\n");
						}
						else if (budget<1000 && budget>=700) {
							JOptionPane.showMessageDialog(null, "Disco De Freio - Topic Jinbei 5 Furos - Abs [R$ 570,00]\n"
									+ "Kit Disco + Pastilha Freio Dianteiro S10 / Blazer 97/11 4x2 - Abs [R$ 790,00]\n ");
						}
						else if (budget>1000) {
							JOptionPane.showMessageDialog(null, "Disco De Freio - Topic Jinbei 5 Furos - Abs [R$ 570,00]\n"
									+ "Kit Disco + Pastilha Freio Dianteiro S10 / Blazer 97/11 4x2 - Abs [R$ 790,00]\n"
									+ "Disco Freio Dianteiro Grand Cherokee 3.6 V6 24v 2010 2011 - [R$ 1.197,00]");
						}
					}
					else if (seatType==3) { //TIPO DE BANCO DOBRÁVEL
						if (budget<500 && budget>=300) {
							JOptionPane.showMessageDialog(null, "Tambor Freio Para Effa Van E Picape Cara Chata - Tambor [R$ 370,00]\n");
						}
						else if (budget<5500 && budget>=700) {
							JOptionPane.showMessageDialog(null, "Tambor Freio Para Effa Van E Picape Cara Chata - Tambor [R$ 370,00]\n"
									+ "Par Tambor De Freio L200 Triton Savana 3.2 2012 A 2016 - Tambor [R$ 5.158,00]\n ");
						}
						else if (budget>5500) {
							JOptionPane.showMessageDialog(null, "Tambor Freio Para Effa Van E Picape Cara Chata - Tambor [R$ 370,00]\n"
									+ "Par Tambor De Freio L200 Triton Savana 3.2 2012 A 2016 - Tambor [R$ 5.158,00]\n"
									+ "Cubo/cartola Montado Mb Axor Freio Tambor-3463504109 - Tambor [R$ 6.990,00]");
						}
					}
					if (shiftType==1) {//TIPO DE CAMBIO AUTOMÁTICO
						
						if (budget<700 && budget>=500) {
							JOptionPane.showMessageDialog(null, "Disco De Freio - Topic Jinbei 5 Furos - Abs [R$ 570,00]\n");
						}
						else if (budget<1000 && budget>=700) {
							JOptionPane.showMessageDialog(null, "Disco De Freio - Topic Jinbei 5 Furos - Abs [R$ 570,00]\n"
									+ "Kit Disco + Pastilha Freio Dianteiro S10 / Blazer 97/11 4x2 - Abs [R$ 790,00]\n ");
						}
						else if (budget>1000) {
							JOptionPane.showMessageDialog(null, "Disco De Freio - Topic Jinbei 5 Furos - Abs [R$ 570,00]\n"
									+ "Kit Disco + Pastilha Freio Dianteiro S10 / Blazer 97/11 4x2 - Abs [R$ 790,00]\n"
									+ "Disco Freio Dianteiro Grand Cherokee 3.6 V6 24v 2010 2011 - [R$ 1.197,00]");
						}
					}
					
					else if (shiftType==2) { //TIPO DE CAMBIO MANUAL
						if (budget<700 && budget>=500) {
							JOptionPane.showMessageDialog(null, "Disco De Freio - Topic Jinbei 5 Furos - Abs [R$ 570,00]\n");
						}
						else if (budget<1000 && budget>=700) {
							JOptionPane.showMessageDialog(null, "Disco De Freio - Topic Jinbei 5 Furos - Abs [R$ 570,00]\n"
									+ "Kit Disco + Pastilha Freio Dianteiro S10 / Blazer 97/11 4x2 - Abs [R$ 790,00]\n ");
						}
						else if (budget>1000) {
							JOptionPane.showMessageDialog(null, "Disco De Freio - Topic Jinbei 5 Furos - Abs [R$ 570,00]\n"
									+ "Kit Disco + Pastilha Freio Dianteiro S10 / Blazer 97/11 4x2 - Abs [R$ 790,00]\n"
									+ "Disco Freio Dianteiro Grand Cherokee 3.6 V6 24v 2010 2011 - [R$ 1.197,00]");
						}
					}
					
				break;
				case 3:
					for(Car carro: car) {
						JOptionPane.showMessageDialog(null, car.toString()); // ADICIONA OS DADOS DO USUÁRIO AO OBJETO CARRO
					}
					
				break;
				case 4:
					exitProgram = 4;
					JOptionPane.showMessageDialog(null, "Obrigado por usar nosso app, até mais! 👋");//SAÍDA DO PROGRAMA
				break;
				default:
					if (exitProgram != 4) {
						JOptionPane.showMessageDialog(null, "Entrada não implementada!");// CASO O PROGRAMA NÃO ACEITA A ENTRADA
					}
					
				}

			}
			
		}


		
		sc.close();
		


	}

}
