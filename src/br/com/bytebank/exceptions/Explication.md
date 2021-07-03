# Pilha de execução (call stack)

A pilha existe para executar algo e para se lembrar de executar algo.

# Exceptions

Serve para tratar erros e mostrá-los explicitamente.


# Try e catch

Podemos usar os métodos ```try{}catch(){}``` para tratarmos excessões. Além disso quando precisamos
tratar mais de um erro usamos a pipi(|) no bloco catch para tratarmos esse erro

### Exemplo;

try {
    System.out.println("Hi");
}catch(ArithmeticException | NullPointerException error) {
    error.getMessage();
}

# Throw

Usamos a palavra reservada **throw** quando queremos lançar uma excessão.

# Criando exceptions

Para criarmos uma execeptions, precisamos entender a hierarquia das classes que nos levam
ao Throwable, a qual é a principal para lidar com erros. Uma das classes que podemos
herdar é a RuntimeException, a qual pode ser usada quando a excessão pode ser previnida.

### Hierarquia das exceptions:


<p style="text-align: center">Throwable</p>

<table>
    <tr>
        <td>
            Exception
        </td>
        <td>
            Error
        </td>
    </tr>
    <tr>
        <td>
            RunTimeException
        </td>
        <td>
            VirtualMachineError
        </td>
    </tr>
    <tr>
        <td>
            ArithmeticException
        </td>
        <td>
            StackOverFlow
        </td>
    </tr>
</table>

# Checked e unchecked.

Quando herdamos a class Exception precisamos antes dizer ao método em que ela é chamada que ela é uma exception.
Já quando herdamos a RunTimeException não precisamos disso.

### Unchecked

Não são verificados pelo compilador.

### Checked

É verificado pelo compilador.

# StackOverflowError

É um erro da máquina virtual para informar que a pilha de execução não tem mais memória.

# Finally 

Vai ser usado junto com o try/catch ou apenas com o try, ele serve para realizar algo independente do que ocorre no try e no catch.

# Nova funcionalidade no try

Na versão 1.7 do JAVA obtemos uma funcionalidade no try, o qual permite receber um paramêtro de uma referência.
Mas para isso é preciso implementar uma interface chamada AutoCloseable na class deseja. Além disso, precisamos implementar um método chamado close. 