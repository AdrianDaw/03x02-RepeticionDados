/* 
 * Copyright 2019 Adrián Pérez Rodríguez - adrianp899@gmail.com .
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Random;

public class Main {

    public static final Random RND = new Random();

    public static void main(String[] args) {
        // REFERENCIAS
        final int CUENTA_INI = 1;
        final int CUENTA_FIN = 20;
        final int numMax = 12;
        final int numMin = 2;
        int tirada;
        int ganadas = 0;
        int ganadasTotales = 0;

        // BUCLE
        for (int i = CUENTA_INI; i < CUENTA_FIN + 1; i++) {
            tirada = RND.nextInt(numMax - numMin + 1) + numMin; // [MIN .. MAX]

            if (tirada == 7) {
                ganadas++;
                ganadasTotales++;
            }
            System.out.printf("Tirada %d ...: %d%n", i, ganadas);
            ganadas = 0;
        }
        // CALCULAR PORCENTAJE
        // Para calcular el porcentaje llamaremos a :
        // (r=caras del dado)  (n=numero de dados)
        // probabilidad = numero de posibilidades(6+1,5+2 y 4+3) / (r^n) 
        int carasDado = 6;
        int numDados = 2;
        int numPosibilidades = 3;
        double probabilidad;

        probabilidad = numPosibilidades / (carasDado ^ numDados);

        System.out.println("RESULTADOS");
        System.out.println("==========");
        System.out.printf("Tiradas ganadas...: %d%n", ganadasTotales);
        System.out.printf("Pobabilidad de 7..: %f%n", probabilidad);
    }
}
