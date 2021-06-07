Program CalculaMedia;

Var valor1, valor2, valor3, media;
Char sair;
Int totalValores;

Begin
media := 0;
totalValores := 3;
sair := "n";

while (sair <> "s") do
begin

writeln ("Digite o primeiro valor");
readln (valor1);

writeln ("Digite o segundo valor");
readln (valor2);

writeln ("Digite o terceiro valor");
readln (valor3);

media:=(valor1+valor2+valor3)/3;

end;

writeln ("A media e ", media);

End.





