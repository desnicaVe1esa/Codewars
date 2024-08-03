# TODO: replace with your own tests (TDD), these are just how-to examples to get you started.

# Ruby/Rspec/Sequel Example:
# While the code section is pure SQL, for testing we use Ruby & Rspec.
# Sequel (https://github.com/jeremyevans/sequel) is used to setup the database and run queries.
# The connection is already made for you, use DB to access.

DB.create_table :years do
  primary_key :id
  int         :year
end    

years = DB[:years]
years.multi_insert([
  { :year => 2000 }, 
  { :year => 2100 }, 
  { :year => 2015 }, 
  { :year => 2020 }])

result = run_sql

def expected 
  [{ :year => 2000, :is_leap => true  },
   { :year => 2015, :is_leap => false },
   { :year => 2020, :is_leap => true  },
   { :year => 2100, :is_leap => false }]
end

compare_with expected do end
