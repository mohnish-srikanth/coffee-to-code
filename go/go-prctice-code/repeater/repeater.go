package iteration

func Repeat(charecter string) string {
	var repeated string
	for i := 0; i < 5; i++ {
		repeated += charecter
	}
	return repeated
}