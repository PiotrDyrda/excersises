# Additional tasks for students

Zadania w tym repozytorium mają oswoić Was z używaniem Stream API. Jeżeli nie czujecie się jeszcze na siłach, aby rozwiązać zadania z jego użyciem, to postarajcie się rozwiązać zadania za pomocą zwykłych pętli.

1. Klasa TasksLongs
    * Zaimplementuj metodę findMaxElement tak, aby zwracała maksymalną wartość znajdującą się na przekazanej w parametrze liście
    * Zaimplementuj metodę findMinElement tak, aby zwracała minimalną wartość znajdującą się na przekazanej w parametrze liście
    * Zaimplementuj metodę findMedianElement tak, aby zwracała medianę wszystkich wartości (mediana to wartość przeciętna, a nie średnia!)
    * Zaimplementuj metodę countLongsGreaterThen tak, aby zwracała ilość wartości większych od wartości "minimalLongValue"
2. Klasa TasksInts (zwróćcie uwagę na to, że parametrem wejściowym jest tutaj tablica typów int)
    * Zaimplementuj metodę findMaxElement tak, aby zwracała maksymalną wartość znajdującą się na przekazanej w parametrze tablicy
    * Zaimplementuj metodę findMinElement(int[] ints) tak, aby zwracała minimalną wartość znajdującą się na przekazanej w parametrze tablicy
    * Zaimplementuj metodę findMinElement(int[] ints, int skippedAmount) tak, aby zwracała n-tą najmniejszą wartość znajdującej się na przekazanej w parametrze tablicy
    * Zaimplementuj metodę sum tak, aby zwracała sumę wszystkich elementów tablicy
3. Klasa TasksLists
    * Zaimplementuj metodę removeDuplicates tak, aby zwracała nową listę, z której zostały usunięte podwójne wartości (jeżeli jedna wartość występowała 2 lub więcej razy, to w wynikowej liście powinna znajdować się tylko raz)
    * Zaimplementuj metodę concatenateStrings tak, aby zwracała wszystkie wartości String zapisane w postaci jednego długiego ciągu znaków (jeżeli na liście znajdowały się String o wartościach "aaa", "bbb", "ccc", to wynikiem powinien być jeden String "aaabbbccc")
    * Zaimplementuj metodę filterByPrefix tak, aby zwracała tylko te wartości, które zaczynają się od danego tekstu
    * Zaimplementuj metodę filterBySuffix tak, aby zwracała tylko te wartości, które kończą się na dany tekst
    * Zaimplementuj metodę groupByLevelValue tak, aby zwracała mapę, w której kluczem będzie numer zapisany po słowie "Level-", a wartością będzie lista obiektów typu String zaczynająca się od tego levelu. Obiekty, które nie zaczynają się od słowa "Level" powinny zostać pominięte.
4. Klasa TasksMaps
    * Zaimplementuj metodę flattenPreserveDuplicates tak, aby zwracała wszystkie listy będące wartościami mapy jako jedną listę. Lista nie powinna usuwać duplikatów.
    * Zaimplementuj metodę flattenNoDuplicates tak, aby zwracała wszystkie listy będące wartościami mapy jako jedną listę. Lista powinna usunąć duplikaty.
	
Zadania z testów jednostkowch, które mają na celu utrwalenie sposobu, w jaki korzysta się z bibliotek jUnit oraz mockito.
0. EmailValidatorTest, LongSumTest, PeselUtilityTest: Napisz kod w testowanych klasach, tak, aby testy zostały zaliczone.
1. CalculatorTest
    Napisz po 3 metody testujące poprawność kalkulatora. Klasa nie wymaga mockowania, a jedynie pisania prostych asercji.
2. ProxyForNumberTest  
    Zaimplementuj metodę testującą dla każdej z metod (getLong, getFloat, getDouble) w klasie ProxyForNumberProvider. Klasa odpytuje serwis NumberProvider o kolejny numer. Waszym zadaniem jest zmockowanie zwracanej wartości przez NumberProvider, oraz sprawdzenie, czy ta zmockowana wartość została zwrócona z service.
3. CalculatorForProviderTest  
    Klasa CalculatorForProvider wykorzystuje znane już metody kalkulatora oraz znany intergace dla pobierania wartości. Należy zmockować zwracane przez NumberProvider wartości i sprawdzić, czy CalculatorForProvider na nich wykonana operacje odejmowania, mnożenia, dzielenia oraz modulo.
4. DatabaseInformationServiceTest  
    Klasa używa sztucznego (zmockowanego)obiektu połączenie do bazy w celu symulowania jej logiki. Waszym zadaniem jest zaimplementowanie brakujących metod testujących, które będą sprawdzały interakcje z bazą. Wymagane jest mockowanie zwracanych przez bazę danych, oraz używanie konstrukcji verify do sprawdzenia, czy zostały wykonane prawidłowe metody na obiekcie bazy.
5. Napisz testy jednostkowe do klasy UserValidator. Postaraj się przetestować jak najwięcej możliwych ścieżek.
6. Napisz klasę UserRegistrationService bazując na testach w klasie UserRegistrationServiceTest.
    Musisz utworzyć brakujące metody w odpowiednich klasach.  
    **Nie możesz nic zmienić  w klasie UserRegistrationServiceTest!**