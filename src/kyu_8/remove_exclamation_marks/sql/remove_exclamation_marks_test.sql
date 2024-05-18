DB[:removeexclamationmarks].multi_insert([
  {s: "Hello World!"},
  {s: "Hello World!!!"},
  {s: "Hi! Hello!"},
  {s: ""},
  {s: "Oh, no!!!"}
])

results = run_sql

describe :columns do
   it "should return 2 columns" do
    expect(results.columns.count).to eq 2
end
end

describe :column_names do
    it "should match column names" do
    expect(results.columns[0].to_s).to eq "s"
    expect(results.columns[1].to_s).to eq "res"
end
end

compare_with expected do end