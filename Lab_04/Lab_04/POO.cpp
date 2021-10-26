
#include "ParenthesisValidation.h"
#include <string>
#include <codecvt>
#include <iostream>
#include <stdexcept>
using namespace std;
class Main
{
	static void main(std::wstring args[]) throw(std::exception)
	{
		File* file = new File(L"E:\POO_04\three_expressions.txt");
		Scanner* sc = new Scanner(file);
		std::wcout << std::wstring(L"File Expression:") << std::endl;
		while (sc->hasNextLine())
		{
			std::wstring input = sc->nextLine();
			std::wstring inputWithoutSpaces = input.replaceAll(L"\\s+", L"");
			std::wcout << input << std::endl;

			if (ParenthesisValidation::checkParenthesis((inputWithoutSpaces)))
			{
				std::wcout << std::wstring(L"Expresia este : Adevarata") << std::endl;
			}

			else
			{
				std::wcout << std::wstring(L"Expresia este : Falsa!") << std::endl;
			}
		}
		sc->close();
	}
};
