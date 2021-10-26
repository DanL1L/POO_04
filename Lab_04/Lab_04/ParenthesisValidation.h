#pragma once

#include <string>
#include <stack>


class ParenthesisValidation
{

public:
	static bool checkParenthesis(const std::wstring& input)
	{

		stack<wchar_t> stack = new stack();

		for (int i = 0; i < input.length(); i++)
		{
			if (input[i] == L'(')
			{
				stack.push(input[i]);
			}

			if (input[i] == L')')
			{
				if (stack.empty())
				{
					return false;
				}

				wchar_t top = stack.pop();
				if ((top == L'(' && input[i] != L')'))
				{
					return false;
				}
			}
		}
		return stack.empty();
	}
};
