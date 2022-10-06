package Kotlin_practice.Kotlin_basic



// Kotlin program to check Identity Matrix by kks

import java.util.*


fun main(args: Array<String>) {


    val rows: Int
    val column: Int

    var isIdentityMatrix: Boolean=true


    val scanner = Scanner(System.`in`)

    print("Enter the no of rows and columns of matrix : ")
    rows   = scanner.nextInt()
    column = scanner.nextInt()

    if(rows!=column) {
        println("Print the square matrix rows and coloumn should be the same : ")
        return
    }


    val matrixA     = Array(rows) { IntArray(column) }


    println("Enter the elements of matrix ($rows X $column} ): ")
    for(i in matrixA.indices){
        for(j in matrixA[i].indices){
            print("matrixA[$i][$j]: ")
            matrixA[i][j]=scanner.nextInt()
        }
    }


    println("Matrix A : ")
    for(i in matrixA.indices){
        println("${matrixA[i].contentToString()} ")
    }


    for(i in matrixA.indices){
        for(j in matrixA[i].indices){

            if(i==j && matrixA[i][j]!=1){
                isIdentityMatrix=false
                break
            }
            else if(i!=j && matrixA[i][j]!=0){
                isIdentityMatrix=false
                break
            }
        }
    }

    if(isIdentityMatrix) println("Identity Matrix !! ") else println("Not an Identity Matrix !!")
}


