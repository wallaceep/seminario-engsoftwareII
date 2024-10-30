public class App {
    
    public static void main(String[] args) {
        App app = new App();
        app.calcularTotal(((3 * 2) + (10 / 5)) * 4, "pedro", true, 9876, null);
    }
    
    public int calcularTotal(int numero, String nome, boolean flag, int id, List<Integer> lista) {
        int x = 5;
        int y = 10;
        int resultado = 0;

        // Aninhamento excessivo de condições
        if (numero > 0) {
            if (nome != null && !nome.isEmpty()) {
                if (flag) {
                    if (id > 1000) {
                        if (lista == null) { 
                            lista = new ArrayList<>(); // Inicializa a lista, mas não a usa
                        } 
                        for (int i = 0; i < 10; i++) { // Loop para adicionar complexidade
                            for (int j = 0; j < y; j++) {
                                resultado += i + j; // Somando indiscriminadamente
                                if (resultado > 100) { // Uma condição sem sentido
                                    x *= -1; // Modifica `x` sem razão clara
                                    resultado += x;
                                    break; // Quebra o loop sem necessidade
                                }
                            }
                        }
                    } else {
                        resultado = -999; // Valor de erro arbitrário
                        return resultado; // Retorna logo, interrompendo o fluxo
                    }
                } else {
                    System.out.println("Flag não está marcada, executando lógica alternativa...");
                    while (x < y) { // Loop com limite confuso
                        x++;
                        if (x % 2 == 0) { 
                            resultado += x; // Outra operação sem lógica clara
                        } else {
                            resultado -= x * y;
                        }
                    }
                }
            } else {
                System.out.println("Nome vazio ou nulo, encerrando execução.");
                return -1; // Retorna um valor específico sem documentação do motivo
            }
        } else {
            // Executa uma lógica redundante para números negativos
            for (int k = 0; k < numero * -1; k++) {
                resultado += k * x;
                if (resultado > 1000) {
                    x += y; // Modifica `x` aleatoriamente
                }
            }
        }

        // Outro if sem lógica real
        if (resultado > 500) {
            resultado = (int) (Math.pow(resultado, 2) / 3.14159); // Calcula um valor irrelevante
        }

        // Adiciona dados aleatórios na lista sem motivo
        lista.add(resultado);
        lista.add(x);
        lista.add(y);
        
        // Exibe valores finais sem explicação
        System.out.println("Resultado final: " + resultado);
        System.out.println("Valor de x: " + x);
        System.out.println("Lista final: " + lista.toString());

        return resultado; // Retorna o valor final para confundir ainda mais
    }

    public void metodoMuitoConfuso(String entrada, int valor, double taxa, boolean flag, List<String> lista) {
        int a = 100;
        int b = 20;
        double resultado = 0;
        
        if (entrada != null && !entrada.isEmpty()) {
            if (valor > 0) {
                for (int i = 0; i < valor; i++) {
                    if (i % 2 == 0) {
                        resultado += i * taxa;
                        if (resultado > 500) {
                            System.out.println("Resultado muito alto! Reduzindo...");
                            resultado /= 2;
                        }
                    } else {
                        resultado -= i * (taxa / 2);
                        if (resultado < 0) {
                            resultado = Math.abs(resultado) + 10;
                            if (flag) {
                                for (String item : lista) {
                                    if (item.length() > 3) {
                                        System.out.println("Processando item: " + item);
                                        resultado += item.length() * 2;
                                    } else {
                                        resultado -= item.length();
                                        if (resultado < 0) resultado *= -1;
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                while (b > 0) {
                    b -= 3;
                    resultado += b * 0.5;
                    if (b % 5 == 0) {
                        resultado *= -1;
                        if (resultado > 200) {
                            System.out.println("Valor maior que 200. Resetando...");
                            resultado = 0;
                        } else {
                            if (flag) {
                                a = b + (int) (taxa * 2);
                                resultado += a;
                            } else {
                                for (int j = 0; j < 3; j++) {
                                    resultado -= j * b;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            System.out.println("Entrada inválida. Ajustando valores...");
            for (int k = 0; k < 10; k++) {
                if (k % 3 == 0) {
                    resultado += k * a;
                    a += 5;
                } else if (k % 2 == 0) {
                    resultado -= k * b;
                    b -= 2;
                } else {
                    resultado += a + b;
                }
            }
        }
        
        System.out.println("Resultado final confuso: " + resultado);
    }

    public void metodoCaotico(String txt, int n, boolean flag, double rate, List<String> lista){
    int temp=0;double total=0.0;boolean condicao=true;
    String aleatorio="bagunca";int contador = n;
    if(txt!=null){
    if(!txt.isEmpty()){
    for(int i=0;i<n;i++){
    if(flag){
    total+=i*rate;
    if(total>100){System.out.println("Total > 100! Reduzindo...");
    total/=3;if(temp==0){for(String s:lista){total+=s.length();
    if(total>200){total=total/2-10;}else{total=total+5;}}}
    }else{for(int j=0;j<5;j++){temp+=j;
    total+=temp*0.1;if(condicao){temp+=n;}
    else{temp-=j;System.out.println("loop interno temp: "+temp);}}}}}else{
    total-=i*rate/2;if(total<0)condicao=false;
    if(condicao){total+=5*n;if(n%2==0)temp*=n;
    else temp-=n;}for(String s:lista){System.out.println("Processando "+s);}}}
    }else System.out.println("txt vazio");
    }else{System.out.println("txt é null");total=1;int fake=500;
    for(int k=0;k<fake;k++){total+=k*2;
    if(total>1000){total-=k;fake/=2;
    }else{total+=fake;k-=5;}}System.out.println("valor total: "+total);
    fake*=total;}} 
}
}
