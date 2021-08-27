package TrabalhoIA;

import java.util.Scanner;

public class TrabalhoTP2 {


	static int x = 0;
	static int y = 0;
	
	static int vazio(int j) {
		if(j == y) {
			y = 0;
			return y;
		}else {
			x = 0;
			return x;
		}
	}
	
	
	static void preencha(int j) {
		
		if(j == y) {
			y = 3;
		}else {
			x = 4;
		}
	}
	
	
	static int transferir_x_a_y(int x, int y) {
		int falta = 4 - x;
		if(y <= falta) {
			x = x + y;
			vazio(y);
			return x;
		}else {
			preencha(x);
			y = y - falta;
			return y;
		}
	}
	static int vazio1(int j) {
		if(j == x) {
			x = 0;
			return x;
		}else {
			y = 0;
			return y;
		}
	}
	
	
	static void preencha1(int j) {
		
		if(j == x) {
			x = 4;
		}else {
			y = 3;
		}
	}
	
	
	static int transferir_x_a_y1(int x, int y) {
		int falta = 3 - y;
		if(x <= falta) {
			y = y + x;
			vazio(x);
			return y;
		}else {
			preencha(y);
			x = x - falta;
			return x;
		}
	}


	public static void main(String[] args) {
	
	int n;	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("============ O problema dos bidões de água ============");
    System.out.println("[1] - Primeira Possibilidade: Comecar a encher o bidao de 4L");
    System.out.println("[2] - Segunda Possibilidade: Comecar a encher o bidao de 3L");
    System.out.println("[3] - Terceira Possibilidade: Encher os dois bidoes");
    System.out.println("[0] - Terminar");
    System.out.println("Escolha uma opcao: ");
    

	n = sc.nextInt();
	 if(n == 1) {
		 System.out.println("Quantidade actual do bidao 4L: "+x);
			System.out.println("Quantidade actual do bidao 3L: "+y);
			System.out.println("1 - Passo: Estado Inicial.");
			System.out.println("====================================="); 
			preencha1(x);
			System.out.println("Quantidade actual do bidao de 4L: "+x);
			System.out.println("Quantidade actual do bidao de 3L: "+y);
			System.out.println("2 - Passo: Encher o bidao de 4L.");

			n = 3;
			System.out.println("Continuar: SIM(1), Terminar(0)");
			System.out.println("====================================="); 
			n = sc.nextInt();
	 }
			if(n == 1) {
				x = transferir_x_a_y1(x, y);

				preencha1(y);
				System.out.println("Quantidade actual no bidao de 4L: "+x);
				System.out.println("Quantidade actual no bidao 3L: "+y);
				System.out.println("3 - Passo: Tranferir a agua do bidao de 4L, para o bidao de 3L.");		
				n = 3;
				System.out.println("Continuar: SIM(1), Terminar(0)");
				System.out.println("====================================="); 
				n = sc.nextInt();
			}
				if(n == 1) {
					x = transferir_x_a_y1(x, y);
					vazio1(y);
					System.out.println("Quantidade actual no bidao de 4L: "+x);
					System.out.println("Quantidade actual no bidao 3L: "+y);
					System.out.println("4 - Passo: Esvaziamos o bidao de 3L.");
					n = 3;
					System.out.println("Continuar: SIM(1), Terminar(0)");
					System.out.println("====================================="); 
					n = sc.nextInt();
				}
					if(n == 1) {
				y = transferir_x_a_y1(x, y);
				vazio1(x);
				System.out.println("Quantidade actual no bidao de 4L: "+x);
				System.out.println("Quantidade actual no bidao 3L: "+y);
				System.out.println("5 - Passo: Transferir a agua do bidao de 4L para o bidao de 3L.");
				
				n = 3;
				System.out.println("Continuar: SIM(1), Terminar(0)");
				System.out.println("====================================="); 
				n = sc.nextInt();
					}
				 if(n == 1) {
						preencha1(x);
						System.out.println("Quantidade actual do bidao de 4L: "+x);
						System.out.println("Quantidade actual do bidao de 3L: "+y);
						System.out.println("6 - Passo: Encher o bidao de 4L.");

						n = 3;
						System.out.println("Continuar: SIM(1), Terminar(0)");
						System.out.println("====================================="); 
						n = sc.nextInt();
				 }
				if(n == 1) {
					System.out.println("7 - Passo: Transferir a agua do bidao de 4L para 3L.");
					x = transferir_x_a_y1(x, y);
					preencha(y);
				
					System.out.println("Quantidade actual do bidao de 4L: "+x);
					System.out.println("Quantidade actual do bidao de 3L: "+y);	
				}


	

	  if(n == 2) {
	System.out.println("Quantidade actual do bidao 4L: "+x);
	System.out.println("Quantidade actual do bidao 3L: "+y);
	System.out.println("1 - Passo: Estado Inicial.");
	System.out.println("====================================="); 
		preencha(x);
		System.out.println("Quantidade actual do bidao de 4L: "+x);
		System.out.println("Quantidade actual do bidao de 3L: "+y);
        System.out.println("2 - Passo: Encher o bidao de 3L.");
 
		n = 3;
		System.out.println("Continuar: SIM(2), Terminar(0)");
		System.out.println("=====================================");
		n = sc.nextInt();
	  }
		  if(n == 2) {

		x = transferir_x_a_y(x, y);
		System.out.println("Quantidade actual do bidao de 4L: "+x);
		System.out.println("Quantidade actual do bidao de 3L: "+y);
		System.out.println("3 - Passo: Transferir a agua do bidao de 3L para o bidao de 4L.");

		n = 3;
		System.out.println("Continuar: SIM(2), Terminar(0)");
		System.out.println("=====================================");
		n = sc.nextInt();
		  }
		if(n == 2) {
			x = transferir_x_a_y(x, y);

			preencha(y);
			System.out.println("Quantidade actual no bidao de 4L: "+x);
			System.out.println("Quantidade actual no bidao 3L: "+y);
			System.out.println("4 - Passo: Voltar a encher o bidao de 3L.");
			
			n = 3;
			System.out.println("Continuar: SIM(2), Terminar(0)");
			System.out.println("=====================================");
			n = sc.nextInt();
		}
			if(n == 2) {
				y = transferir_x_a_y(y, x);

				preencha(x);
				System.out.println("Quantidade actual no bidao de 4L: "+x);
				System.out.println("Quantidade actual no bidao 3L: "+y);
				System.out.println("5 - Passo: Transferir a agua do bidao de 3L para o bidao de 4L.");
				
				n = 3;
				System.out.println("Continuar: SIM(2), Terminar0)");
				System.out.println("=====================================");
				n = sc.nextInt();
			}
				if(n == 2) {
					y = transferir_x_a_y(y, x);
					vazio(x);

					System.out.println("Quantidade actual no bidao de 4L: "+x);
					System.out.println("Quantidade actual no bidao 3L: "+y);
					System.out.println("6 - Passo: Esvaziar bidao de 4L");
					
					n = 3;
					System.out.println("Continuar: SIM(2), Terminar(0)");
					System.out.println("=====================================");
					n = sc.nextInt();
				}
				
			if(n == 2) {
				
				x = transferir_x_a_y(x, y);

				vazio(y);
				System.out.println("7 - Passo: Transferir a agua do bidao de 3L para 4L");
				System.out.println("Quantidade actual do bidao de 4L: "+x);
				System.out.println("Quantidade actual do bidao de 3L: "+y);	
				System.out.println("===== Estado Final ====");
				
			}
			  if(n == 3) {
					System.out.println("Quantidade actual do bidao 4L: "+x);
					System.out.println("Quantidade actual do bidao 3L: "+y);
					System.out.println("1 - Passo: Estado Inicial.");
					System.out.println("=====================================");
								preencha1(x);
								preencha1(y);
								System.out.println("Quantidade actual do bidao de 4L: "+x);
								System.out.println("Quantidade actual do bidao de 3L: "+y);
								System.out.println("2 - Passo: Encher o bidao de 4L e 3L.");
								n = 3;
								       System.out.println("Qual dos bidoes deseja esvaziar?.. Digite [5] 4L e [6] 3L");
								       System.out.println("=====================================");
								n = sc.nextInt(); 
								
				if(n == 5) {
				preencha1(y);
				vazio1(x);
			  System.out.println("Quantidade actual do bidao de 4L: "+x);
			  System.out.println("Quantidade actual do bidao de 3L: "+y);
			  System.out.println("3 - Passo: Esvaziamos o bidao de 4L.");
				n = 3;
			  System.out.println("Continuar: SIM(5), Terminar(0)");
			  System.out.println("=====================================");
			 n = sc.nextInt();
				}
								
				  if(n == 5) {
               //preencha(x);
				x = transferir_x_a_y(x, y);
			    vazio(y);
			 System.out.println("Quantidade actual do bidao de 4L: "+x);
			System.out.println("Quantidade actual do bidao de 3L: "+y);
			System.out.println("4 - Passo: Transferir a agua do bidao de 3L para o bidao de 4L.");
			n = 3;
			System.out.println("Continuar: SIM(5), Terminar(0)");
			System.out.println("=====================================");
			n = sc.nextInt();
				  }
												  
		   if(n == 5) {
		  x = transferir_x_a_y(x, y);
		  preencha(y);
		  System.out.println("Quantidade actual no bidao de 4L: "+x);
		  System.out.println("Quantidade actual no bidao 3L: "+y);
		 System.out.println("5 - Passo: Voltar a encher o bidao de 3L.");
		  n = 3;
		System.out.println("Continuar: SIM(5), Terminar(0)");
		System.out.println("=====================================");
		n = sc.nextInt();
		   }
												
	   if(n == 5) {
	    y = transferir_x_a_y(y, x);
        preencha(x);
	  System.out.println("Quantidade actual no bidao de 4L: "+x);
	  System.out.println("Quantidade actual no bidao 3L: "+y);
	 System.out.println("6 - Passo: Transferir a agua do bidao de 3L para o bidao de 4L.");
	  n = 3;
	System.out.println("Continuar: SIM(5), Terminar0)");
	   System.out.println("=====================================");
	  n = sc.nextInt();
	   }				
	  if(n == 5) {
			y = transferir_x_a_y(y, x);
					vazio(x);

			System.out.println("Quantidade actual no bidao de 4L: "+x);
		System.out.println("Quantidade actual no bidao 3L: "+y);
		System.out.println("7 - Passo: Esvaziar bidao de 4L");
		n = 3;
		System.out.println("Continuar: SIM(5), Terminar(0)");
			System.out.println("=====================================");
		n = sc.nextInt();
	  }
			if(n == 5) {
				x = transferir_x_a_y(x, y);
				vazio(y);
				System.out.println("8 - Passo: Transferir a agua do bidao de 3L para 4L");
				System.out.println("Quantidade actual do bidao de 4L: "+x);
				System.out.println("Quantidade actual do bidao de 3L: "+y);	
				System.out.println("===== Estado Final ====");
														
					}
		
						if(n == 6) {
						preencha1(x);
						vazio1(y);
						System.out.println("Quantidade actual do bidao de 4L: "+x);
						System.out.println("Quantidade actual do bidao de 3L: "+y);
						System.out.println("3 - Passo: Esvaziamos o bidao de 3L.");
						n = 3;
						System.out.println("Continuar: SIM(6), Terminar(0)");
						System.out.println("=====================================");
						n = sc.nextInt();
						if(n == 6) {
							x = transferir_x_a_y1(x, y);
							preencha1(y);
							System.out.println("Quantidade actual no bidao de 4L: "+x);
							System.out.println("Quantidade actual no bidao 3L: "+y);
							System.out.println("4 - Passo: Tranferir a agua do bidao de 4L, para o bidao de 3L.");
							
							n = 3;
							System.out.println("Continuar: SIM(6), Terminar(0)");
							System.out.println("=====================================");
							n = sc.nextInt();
						
							if(n == 6) {
								x = transferir_x_a_y1(x, y);
								vazio1(y);
								System.out.println("Quantidade actual no bidao de 4L: "+x);
								System.out.println("Quantidade actual no bidao 3L: "+y);
								System.out.println("5 - Passo: Esvaziamos o bidao de 3L.");
								
								n = 3;
								System.out.println("Continuar: SIM(6), Terminar(0)");
								System.out.println("=====================================");
								n = sc.nextInt();
								if(n == 6) {
							y = transferir_x_a_y1(x, y);
							vazio1(x);
							System.out.println("Quantidade actual no bidao de 4L: "+x);
							System.out.println("Quantidade actual no bidao 3L: "+y);
							System.out.println("6 - Passo: Transferir a agua do bidao de 4L para o bidao de 3L.");
							
							n = 3;
							System.out.println("Continuar: SIM(6), Terminar(0)");
							System.out.println("=====================================");
							n = sc.nextInt();
							 if(n == 6) {
									preencha1(x);
									System.out.println("Quantidade actual do bidao de 4L: "+x);
									System.out.println("Quantidade actual do bidao de 3L: "+y);
									System.out.println("7 - Passo: Encher o bidao de 4L.");
									n = 3;
									System.out.println("Continuar: SIM(6), Terminar(0)");
									System.out.println("=====================================");
									n = sc.nextInt();
							if(n == 6) {
								System.out.println("8 - Passo: Transferir a agua do bidao de 4L para 3L.");
								x = transferir_x_a_y1(x, y);
								preencha1(y);
								System.out.println("Quantidade actual do bidao de 4L: "+x);
								System.out.println("Quantidade actual do bidao de 3L: "+y);	
								System.out.println("==== Estado Final ====");
							}
				
			
		}else {
			System.out.println("Programa encerrado!!!");
		}
		}else {
			System.out.println("Programa encerrado!!!");
		}
		}else {
			System.out.println("Programa encerrado!!!");
		}
		
	 }else {
		System.out.println("Programa encerrado!!!");
		
	  }
	  }else {
			System.out.println("Programa encerrado!!!");
			
		  }
			  }else {
					System.out.println("Programa encerrado!!!");
					
				  }
				 
 }

	}

