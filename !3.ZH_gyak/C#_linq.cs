using System;
using System.Collections.Generic;
using System.Linq;

class Program2
{
    static void Main()
    {
        // Példákhoz használt minta adatok
        var students = new List<Student>
        {
            new Student ("Anna",  new List<int> { 90, 85, 88 } ),
            new Student ( "Béla", new List<int> { 80, 75, 70 } ),
            new Student ("Csilla",new List<int> { 100, 98, 95 } ),
            new Student ( "Dávid",new List<int> { 58, 60, 65 } ),
            new Student ("Eszter",  new List<int> { 9, 7, 85 } )
        };

        // 1. Tanulók nevei ábécérendben.
        var namesAlphabetical = students
            .Select(s => s.Name) // Csak a neveket választjuk ki.
            .OrderBy(name => name) // A neveket ábécérendbe állítjuk.
            .ToList();

        Console.WriteLine("1. Names Alphabetical:");
        namesAlphabetical.ForEach(name => Console.WriteLine(name));

        // 2. Átlagosan 85 fölötti pontszámmal rendelkező tanulók nevei.
        var topStudents = students
            .Where(s => s.Grades.Average() > 85) // Csak azokat a tanulókat választjuk, akik átlaga > 85.
            .Select(s => s.Name) // Csak a nevükre van szükségünk.
            .ToList();

        Console.WriteLine("\n2. Students with Average Grade > 85:");
        topStudents.ForEach(name => Console.WriteLine(name));

        // 3. A legmagasabb osztályzat minden tanuló esetén.
        var highestGrades = students
            .Select(s => new { s.Name, HighestGrade = s.Grades.Max() }) // Kiválasztjuk minden tanuló nevét és legjobb jegyét.
            .ToList();

        /*
         * Az new { s.Name, HighestGrade = s.Grades.Max() } 
         * egy anonim típus létrehozását jelenti, 
         * amely tartalmazza a tanuló nevét és a legmagasabb jegyét. 
         * Az anonim típus gyors, ideiglenes megoldás, 
         * amely megspórolja az explicit osztálydefiníciót.
         */

        Console.WriteLine("\n3. Highest Grades:");
        highestGrades.ForEach(s => Console.WriteLine($"{s.Name}: {s.HighestGrade}"));

        // 4. Tanulók csoportosítása aszerint, hogy átmentek-e vagy sem.
        var groupedByPassOrFail = students
            .GroupBy(s => s.Grades.Average() >= 60 ? "Pass" : "Fail") // Két csoportra osztjuk őket: "Pass" és "Fail".
            .ToList();

        Console.WriteLine("\n4. Pass or Fail Groups:");
        foreach (var group in groupedByPassOrFail)
        {
            Console.WriteLine($"{group.Key}:");
            foreach (var student in group)
            {
                Console.WriteLine($"  {student.Name}");
            }
        }

        // 5. Tanulók rendezése a legjobb osztályzatuk szerint.
        var sortedByHighestGrade = students
            .OrderByDescending(s => s.Grades.Max()) // Csökkenő sorrend a legmagasabb osztályzat alapján.
            .ToList();

        Console.WriteLine("\n5. Sorted by Highest Grade:");
        sortedByHighestGrade.ForEach(s => Console.WriteLine($"{s.Name} - {s.Grades.Max()}"));

        // 6. Egyedi osztályzatok az összes tanuló közül.
        var uniqueGrades = students
            .SelectMany(s => s.Grades) // Az összes tanuló osztályzatát egy listába gyűjtjük.
            .Distinct() // Csak az egyedi értékek maradnak.
            .OrderBy(g => g) // Rendezés növekvő sorrendben.
            .ToList();

        Console.WriteLine("\n6. Unique Grades:");
        uniqueGrades.ForEach(grade => Console.WriteLine(grade));

        // 7. Tanulók száma különböző osztályzati tartományok szerint.
        var studentsByGradeRange = students
            .Select(s => new
            {
                s.Name,
                GradeRange = s.Grades.Average() switch // Átlageredményeket tartományokba soroljuk.
                {
                    <= 60 => "50-60",
                    <= 70 => "61-70",
                    <= 80 => "71-80",
                    <= 90 => "81-90",
                    _ => "91-100"
                }
            })
            .GroupBy(g => g.GradeRange) // Csoportosítás tartomány szerint.
            .Select(g => new
            {
                GradeRange = g.Key,
                StudentCount = g.Count()
            })
            .ToList();

        Console.WriteLine("\n7. Number of Students per Grade Range:");
        studentsByGradeRange.ForEach(g => Console.WriteLine($"{g.GradeRange}: {g.StudentCount}"));

        // 8. A tanulók összesített medián osztályzata.
        var allGrades = students
            .SelectMany(s => s.Grades) // Minden osztályzatot összefűzünk.
            .OrderBy(g => g) // Rendezés növekvő sorrendben.
            .ToList();

        double medianGrade;
        if (allGrades.Count % 2 == 0)
        {
            // Páros eset: két középső osztályzat átlaga.
            medianGrade = (allGrades[allGrades.Count / 2 - 1] + allGrades[allGrades.Count / 2]) / 2.0;
        }
        else
        {
            // Páratlan eset: középső elem.
            medianGrade = allGrades[allGrades.Count / 2];
        }

        Console.WriteLine($"\n8. Median Grade: {medianGrade}");
    }
}

// Segéd osztály a tanulók reprezentálására.
class Student
{
    public string Name { get; set; } // Tanuló neve.
    public List<int> Grades { get; set; } // Tanuló osztályzatai.

    public Student(string name, List<int> grades)
    {
        Name = name;
        Grades = grades;
    }
}
